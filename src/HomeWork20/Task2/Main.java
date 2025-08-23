package HomeWork20.Task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] originalArray = generateRandomArray(size);
        System.out.println("Исходный массив: " + Arrays.toString(originalArray));
        int[] arrayForInsertion = Arrays.copyOf(originalArray, originalArray.length);
        int[] arrayForSelection = Arrays.copyOf(originalArray, originalArray.length);
        int[] arrayForBubble = Arrays.copyOf(originalArray, originalArray.length);

        Thread insertionThread = new Thread(new InsertionSort(arrayForInsertion), "InsertionSort");
        Thread selectionThread = new Thread(new SelectionSort(arrayForSelection), "SelectionSort");
        Thread bubbleThread = new Thread(new BubbleSort(arrayForBubble), "BubbleSort");

        insertionThread.start();
        selectionThread.start();
        bubbleThread.start();

        insertionThread.join();
        selectionThread.join();
        bubbleThread.join();

        System.out.println("Сортировка вставками: " + Arrays.toString(arrayForInsertion));
        System.out.println("Сортировка выбором:   " + Arrays.toString(arrayForSelection));
        System.out.println("Сортировка пузырьком: " + Arrays.toString(arrayForBubble));

        scanner.close();
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
