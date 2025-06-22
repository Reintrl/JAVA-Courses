package HomeWork1;

public class Main {
    public static void main(String[] args) {
        //Task 1 ====================================

        int b = 10, c = 5;
        int a = 4 * (b + c - 1) / 2;

        System.out.println("Answer: " + a);

        //Task 2 ====================================
        /*
        int n = 69, sumDigits;
        sumDigits = (n / 10) + (n % 10);

        System.out.println("The sum of the digits: " + sumDigits);
        */

        //Task 3 ====================================
        /*int n = 819, sumDigits;

        sumDigits = (n / 100) + (n % 100 / 10) + (n % 10);

        System.out.println("The sum of the digits: " + sumDigits);
        */

        //Task 4 ====================================
        /*
        double n = 9.4999;
        int result = (int) (n + 0.5);

        System.out.println("The result of rounding: " + result);
        */

        //Task 5 ====================================
        /*
        int q = 21, w = 8, remainder, result;

        result = q / w;
        remainder = q % w;

        System.out.println("Result: " + result + "\nRemainder: " + remainder);
        */

        //Additional task 1 =========================
        /*
        int seconds = 40634, minutes, hours;

        hours = seconds / (60 * 60);
        minutes = (seconds % (60 * 60)) / 60;
        seconds = seconds % 60;

        System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
        */

        //Additional task 2 =========================
        /*
        int number = 87, result;
        result = number % 10 * 10 + number / 10;

        System.out.println("The result of the relocation: " + result);
        */
    }
}