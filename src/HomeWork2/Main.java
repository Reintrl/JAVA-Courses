package HomeWork2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Control structures
        //Task 1 ========================================

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mouth number: ");

        if (scanner.hasNextInt()) {
            int month = scanner.nextInt();

            String result = switch (month) {
                case 1, 2, 12 -> "Winter";
                case 3, 4, 5 -> "Spring";
                case 6, 7, 8 -> "Summer";
                case 9, 10, 11 -> "Autumn";
                default -> null;
            };

            System.out.print("Time of year: " + result);
        } else {
            System.out.print("Invalid input");
        }
        scanner.close();


        //Task 2 ========================================
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mouth number: ");

        if (scanner.hasNextInt()) {
            int month = scanner.nextInt();

            String result;
            if (month == 1 || month == 12 || month == 2)
                result = "Winter";
            else if (month >= 3 && month <= 5)
                result = "Spring";
            else if (month >= 6 && month <= 8)
                result = "Summer";
            else if (month >= 9 && month <= 11)
                result = "Autumn";
            else
                result = "Idk";

            System.out.print("Time of year: " + result);
        } else {
            System.out.print("Invalid input");
        }
        scanner.close();
        */

        //Task 3 ========================================
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.print("The number is even");
            } else {
                System.out.print("The number is odd");
            }
        } else {
            System.out.print("Invalid input");
        }
        scanner.close();
         */
        //Task 4 ========================================
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a temperature: ");

        if (scanner.hasNextDouble()) {
            double temp = scanner.nextDouble();

            if (temp > -5) {
                System.out.print("Тепло");
            } else if (temp > -20) {
                System.out.print("Нормально");
            } else {
                System.out.print("Холодно");
            }

        } else {
            System.out.print("Invalid input");
        }
        scanner.close();
        */

        //Cycles
        //Task 1 ========================================
        /*
        for (int i = 1; i <= 99; i+=2) {
            System.out.print(i + " ");
        }
        */

        //Task 2 ========================================
        /*
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        */

        //Task 3 ========================================
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println(sum);
            scanner.close();
        }
        */

        //Task 4 ========================================
        /*
        int num = 7;

        while (num <= 98) {
            System.out.print(num + " ");
            num += 7;
        }
        */

        //Task 5 ========================================
        /*
        int n = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print(n + " ");
            n -= 5;
        }
        */

        //Task 6 ========================================
        /*
        for (int i = 10; i <= 20; i++) {
            System.out.print(i * i + " ");
        }
        */

        //Additional task 1 =============================
        /*
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        */

        //Additional task 2 =============================
        /*
        int count = 11;
        int first = 1, second = 1, next;

        System.out.print(first + " " + second + " ");
        for (int i = 2; i < count; i++) {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        */
    }
}