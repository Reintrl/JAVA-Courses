package HomeWork17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату рождения (yyyy-mm-dd): ");
        String dateString = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateString, formatter);

        if (date.isAfter(LocalDate.now())) {
            System.out.println("Дата рождения не может быть в будущем!");
            return;
        }

        date = date.plusYears(100);
        System.out.println(date);
        scanner.close();
    }
}
