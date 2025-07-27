package HomeWork12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String line = scanner.nextLine();


        Matcher matcher = Pattern.compile("\\b[A-Z]{2,6}\\b").matcher(line);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        scanner.close();
    }
}
