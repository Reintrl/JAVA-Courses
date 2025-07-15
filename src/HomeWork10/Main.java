package HomeWork10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Task1
        Address address1 = new Address("ул. Ленина", "Москва", "123456");
        Address address2 = new Address("ул. Ленина", "Москва", "123456");
        Address address3 = new Address("ул. Ленина", "Санкт-Петербург", "131236");

        User user1 = new User(1, "ivanov", "ivanov@example.com", address1);
        User user2 = new User(1, "ivanov", "ivanov@example.com", address2);
        User user3 = new User(3, "petrov", "petrov@example.com", address3);
        User user4 = new User(4, "lameko", "lameko@example.com", address2);
        User user5 = new User(5, "aleksei", "aleksei@example.com", address3);


        System.out.println("\nСравнение объектов с одинаковыми полями");
        System.out.println("user1.equals(user2): " + user1.equals(user2)); // true
        System.out.println("\nСравнение объектов с разными полями");
        System.out.println("user1.equals(user3): " + user1.equals(user3)); // false

        // Task2
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nuser1: " + user1);
        System.out.println("user2: " + user2);
        System.out.println("user3: " + user3);
        System.out.println("user4: " + user4);
        System.out.println("user5: " + user5);
        System.out.println("Выбери пользователя по номеру: ");
        int choiceUser = scanner.nextInt();
        User userForClone = null;
        switch (choiceUser) {
            case 1 -> userForClone = user1;
            case 2 -> userForClone = user2;
            case 3 -> userForClone = user3;
            case 4 -> userForClone = user4;
            case 5 -> userForClone = user5;
            default -> {
                System.out.println("Неверный выбор");
                return;
            }
        }

        System.out.println("Выбери тип клонирования: \n1 - поверхностное\n2 - глубокое");
        int choiceCopy = scanner.nextInt();

        switch (choiceCopy) {
            case 1 -> {
                User userCopy = userForClone.clone();
                System.out.println("Оригинал: " + userForClone.getAddress());
                System.out.println("Клон:     " + userCopy.getAddress());

                userCopy.getAddress().setStreet("Новая улица");
                System.out.println("\nПосле изменения адреса в клоне:");
                System.out.println("Оригинал: " + userForClone.getAddress()); // изменился!
                System.out.println("Клон:     " + userCopy.getAddress());
            }
            case 2 -> {
                User userDeepCopy = userForClone.deepClone();
                System.out.println("Оригинал: " + userForClone.getAddress());
                System.out.println("Клон:     " + userDeepCopy.getAddress());

                userDeepCopy.getAddress().setStreet("Другая улица");
                System.out.println("\nПосле изменения адреса в клоне:");
                System.out.println("Оригинал: " + userForClone.getAddress()); // не изменился
                System.out.println("Клон:     " + userDeepCopy.getAddress());
            }
            default -> System.out.println("Неверный выбор");
        }

        scanner.close();
    }
}
