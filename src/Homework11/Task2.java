package Homework11;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 строки: ");
        String[] inputLines = {scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};
        String temp;

        for (int i = 0; i < inputLines.length - 1; i++) {
            for (int j = i + 1; j < inputLines.length; j++) {
                if (inputLines[i].length() > inputLines[j].length()) {
                    temp = inputLines[i];
                    inputLines[i] = inputLines[j];
                    inputLines[j] = temp;
                }
            }
        }

        System.out.println("\nСтроки, отсортированные по длине: " + Arrays.toString(inputLines));

        scanner.close();
    }
}
