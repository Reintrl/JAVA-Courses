package Homework11;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 строки: ");
        String[] inputLines = {scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};

        int indexMin = 0;
        int indexMax = 0;
        for (int i = 1; i < 3; i++) {
            if (inputLines[i].length() < inputLines[indexMin].length()) {
                indexMin = i;
            } else if (inputLines[i].length() > inputLines[indexMax].length()) {
                indexMax = i;
            }
        }

        System.out.println("Самая короткая строка: \"" + inputLines[indexMin] + "\" Eё длина: " + inputLines[indexMin].length()
                + "\nСамая длинная строка: \"" + inputLines[indexMax] + "\" Eё длина: " + inputLines[indexMax].length());

        scanner.close();
    }
}
