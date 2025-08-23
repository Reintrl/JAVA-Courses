package HomeWork20.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        if (size == 0) {
            System.out.println("Размер не может быть 0!");
            return;
        }

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        MinFinder minFinder = new MinFinder(array);
        MaxFinder maxFinder = new MaxFinder(array);
        minFinder.start();
        maxFinder.start();

        minFinder.join();
        maxFinder.join();
        System.out.println("Минимум: " + minFinder.getResult());
        System.out.println("Mаксимум: " + maxFinder.getResult());

        scanner.close();
    }
}
