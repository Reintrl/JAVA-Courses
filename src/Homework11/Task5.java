package Homework11;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String line = scanner.nextLine();

        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (String.valueOf(line.charAt(i)).matches("[\\p{L}\\p{N}]"))
                newWord.append(line.charAt(i)).append(line.charAt(i));
            else
                newWord.append(line.charAt(i));
        }

        System.out.println(newWord);

        scanner.close();
    }
}
