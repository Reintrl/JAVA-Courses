package Homework11;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 строки: ");
        String[] inputLines = {scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};

        String result = null;
        boolean found = false;

        for (int lineIndex = 0; lineIndex < 3 && !found; lineIndex++) {
            String[] words = inputLines[lineIndex].split("\\s+");

            for (int wordIndex = 0; wordIndex < words.length && !found; wordIndex++) {
                String word = words[wordIndex];
                boolean allUnique = true;

                for (int i = 0; i < word.length() && allUnique; i++) {
                    for (int j = i + 1; j < word.length(); j++) {
                        if (word.charAt(i) == word.charAt(j)) {
                            allUnique = false;
                            break;
                        }
                    }
                }

                if (allUnique) {
                    result = word;
                    found = true;
                }
            }
        }

        if (found) {
            System.out.println("Первое слово с уникальными символами: " + result);
        } else {
            System.out.println("Слов с уникальными символами не найдено.");
        }

        scanner.close();
    }
}
