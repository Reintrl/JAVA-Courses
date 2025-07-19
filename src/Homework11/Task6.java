package Homework11;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String line = scanner.nextLine();

        while (line.isEmpty()) {
            System.out.println("Вы ввели пустую строку!");
            System.out.print("Введите строку: ");
            line = scanner.nextLine();
        }

        String[] words = line.split("\\s+");

        System.out.print("Введите номер слова: ");
        int num = scanner.nextInt();
        while (num < 1 || num > words.length) {
            System.out.println("Ошибка!\nВсего слов: " + words.length);
            System.out.print("Введите номер слова: ");
            num = scanner.nextInt();
        }

        String wordToCheck = words[num - 1].toLowerCase();

        for (int i = 0; i < wordToCheck.length() / 2; i++) {
            if (wordToCheck.charAt(i) != wordToCheck.charAt(wordToCheck.length() - i - 1)) {
                System.out.println("Слово \"" + wordToCheck + "\" не является палиндромом");
                return;
            }
        }

        System.out.println("Слово \"" + wordToCheck + "\" является палиндромом");

        scanner.close();
    }
}
