package Homework11;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 строки: ");
        String[] inputLines = {scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};

        double avgLength = 0;
        for (String line : inputLines) {
            avgLength += line.length();
        }
        avgLength /= 3;

        System.out.println("Средняя длина строк: " + avgLength + "\nСтроки с длинной меньше среднего: ");
        for (String line : inputLines) {
            if (line.length() < avgLength)
                System.out.println("\"" + line + "\" Eё длина: " + line.length());
        }

        scanner.close();
    }
}
