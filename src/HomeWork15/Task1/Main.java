package HomeWork15.Task1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> numbersAfterDeliverance = new LinkedHashSet<>();

        System.out.print("Введите строку (Например: \"1, 2, 3, 4, 4, 5\"): ");
        String numbers = scanner.nextLine();

        Matcher matcher = Pattern.compile("\\b[0-9]+\\b").matcher(numbers);
        while (matcher.find()) {
            numbersAfterDeliverance.add(matcher.group());
        }

        System.out.println(numbersAfterDeliverance);

        scanner.close();
    }
}
