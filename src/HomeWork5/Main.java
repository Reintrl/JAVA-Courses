package HomeWork5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1 =======================================
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите количество строк массива: ");
        int n = scanner.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Исходный массив");
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.print("Введите значение которое мы прибавим к каждому элементу: ");
        int value = scanner.nextInt();

        System.out.println("Преобразованный массив");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] += value;
                sum += array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Сумма всех чисел в массиве: " + sum);
        scanner.close();

        // Task 2 =======================================
/*      String[][] arrayChessboard = new String[8][8];
        for (int i = 0; i < arrayChessboard.length; i++) {
            for (int j = 0; j < arrayChessboard[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    arrayChessboard[i][j] = "W";
                } else {
                    arrayChessboard[i][j] = "B";
                }
                System.out.print(arrayChessboard[i][j] + " ");
            }
            System.out.println();
        }
*/
        // Task* ========================================
/*      Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        int n = scanner.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = count++;
                }
            } else {
                for (int j = array[i].length - 1; j >= 0; j--) {
                    array[i][j] = count++;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
        scanner.close();
        */
    }
}