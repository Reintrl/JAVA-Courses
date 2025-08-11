package HomeWork17;

import java.util.Scanner;
import java.util.function.Supplier;

public class Task5 {
    public static void main(String[] args) {
        Supplier<String> reverseString = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String line = scanner.nextLine();
            scanner.close();
            return new StringBuilder(line).reverse().toString();
        };

        System.out.println(reverseString.get());
    }
}
