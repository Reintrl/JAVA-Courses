package HomeWork14.Task2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте путь к входному файлу: ");
        String filePath = scanner.nextLine().trim();
        ArrayList<String> validDocuments = new ArrayList<>();
        ArrayList<String> invalidDocuments = new ArrayList<>();

        try (FileReader fileReader = new FileReader(filePath)) {
            StringBuilder currentLine = new StringBuilder();
            int charCode;

            while ((charCode = fileReader.read()) != -1) {
                char c = (char) charCode;

                if (c == '\n' || c == '\r') {
                    if (currentLine.length() > 0) {
                        String validationResult = validateDocument(currentLine.toString().trim());
                        if (validationResult.equals("VALID")) {
                            validDocuments.add(currentLine.toString());
                        } else {
                            invalidDocuments.add(currentLine.toString() + " - " + validationResult);
                        }
                        currentLine.setLength(0);
                    }
                } else {
                    currentLine.append(c);
                }
            }

            if (currentLine.length() > 0) {
                String validationResult = validateDocument(currentLine.toString().trim());
                if (validationResult.equals("VALID")) {
                    validDocuments.add(currentLine.toString());
                } else {
                    invalidDocuments.add(currentLine.toString() + " - " + validationResult);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
            return;
        }

        writeToFile("D:\\valid_documents.txt", validDocuments);
        writeToFile("D:\\invalid_documents.txt", invalidDocuments);

        System.out.println("Проверка завершена. Результаты:");
        System.out.println("Валидные документы: D:\\valid_documents.txt (" + validDocuments.size() + ")");
        System.out.println("Невалидные документы: D:\\invalid_documents.txt (" + invalidDocuments.size() + ")");

        scanner.close();
    }

    private static String validateDocument(String document) {
        if (document.length() != 15) {
            return "Недопустимая длина (должно быть 15 символов, получено " + document.length() + ")";
        }

        if (!document.matches("^[a-zA-Z0-9]+$")) {
            return "Содержит недопустимые символы";
        }

        if (document.startsWith("docnum") || document.startsWith("contract")) {
            return "VALID";
        } else {
            return "Не начинается с 'docnum' или 'contract'";
        }
    }

    private static void writeToFile(String filename, ArrayList<String> lines) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (String line : lines) {
                writer.write(line + System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл " + filename + ": " + e.getMessage());
        }
    }
}
