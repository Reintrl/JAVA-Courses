package HomeWork4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        double[] array = new double[size];

        System.out.print("Как вы хотите заполнить массив? \n(1 - вручную; 2 - рандом): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: {
                for (int i = 0; i < size; i++) {
                    System.out.print("Введите " + (i + 1) + " элемент массива: ");
                    array[i] = scanner.nextDouble();
                }
                break;
            }
            case 2: {
                for (int i = 0; i < size; i++) {
                    array[i] = Math.random() * 100;
                }
                break;
            }
            default: {
                System.out.println("Введён неизвестный вариант заполнения!");
                break;
            }
        }

        System.out.print("Выбери задание\n(1 - 7): ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1: {
                System.out.print("Прямой порядок: ");
                for (double num : array) {
                    System.out.print(num + " ");
                }

                System.out.print("\nОбратный порядок: ");
                for (int i = size - 1; i >= 0; i--) {
                    System.out.print(array[i] + " ");
                }
                break;
            }
            case 2: {
                double max = array[0], min = array[0];
                for (int i = 1; i < size; i++) {
                    if (max < array[i]) {
                        max = array[i];
                    }
                    if (min > array[i]) {
                        min = array[i];
                    }
                }

                System.out.println("Максимальный элемент: " + max + "\nМинимальный элемент: " + min);
                break;
            }
            case 3: {
                double max = array[0], min = array[0];
                int indexMax = 0, indexMin = 0;
                for (int i = 1; i < size; i++) {
                    if (max < array[i]) {
                        indexMax = i;
                    }
                    if (min > array[i]) {
                        indexMin = i;
                    }
                }

                System.out.println("Максимальный элемент: [" + indexMax + "]\nМинимальный элемент: [" + indexMin + "]");
                break;
            }
            case 4: {
                int count = 0;
                for (int i = 0; i < size; i++) {
                    if (array[i] == 0) {
                        count++;
                    }
                }

                if (count == 0) {
                    System.out.println("Нулевые элементы отсутствуют");
                } else {
                    System.out.println("Количество нулевых элементов: " + count);
                }
                break;
            }
            case 5: {
                System.out.print("До: ");
                for (double num : array) {
                    System.out.print(num + " ");
                }

                double temp;
                for (int i = 0; i < size / 2; i++) {
                    temp = array[i];
                    array[i] = array[size - 1 - i];
                    array[size - 1 - i] = temp;
                }

                System.out.print("\nПосле: ");
                for (double num : array) {
                    System.out.print(num + " ");
                }
                break;
            }
            case 6: {
                boolean flag = true;
                for (int i = 0; i < size - 1; i++) {
                    if (array[i] >= array[i + 1]) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("Массив НЕ является возрастающей последовательностью");
                } else {
                    System.out.println("Массив является возрастающей последовательностью");
                }
                break;
            }
            case 7: {
                boolean flag = true;
                for (double num : array) {
                    if (num < 0 || num > 9) {
                        System.out.println("Массив не соответствует условию!");
                        flag = false;
                        break;
                    }
                }
                if (array[0] == 0 && size != 1) {
                    System.out.println("Массив не соответствует условию!");
                    break;
                }

                if (flag) {
                    System.out.print("До: ");
                    for (double num : array) {
                        System.out.printf("%.0f", num);
                    }
                    boolean shift = false;
                    for (int i = size - 1; i >= 0; i--) {
                        if (array[i] == 9) {
                            array[i] = 0;
                        } else {
                            array[i] = array[i] + 1;
                            break;
                        }

                        if (i == 0)
                            shift = true;
                    }
                    if (shift) {
                        double[] newArray = new double[size + 1];
                        newArray[0] = 1;
                        System.out.print("После: ");
                        for (double num : newArray) {
                            System.out.printf("%.0f", num);
                        }
                    } else {
                        System.out.print("\nПосле: ");
                        for (double num : array) {
                            System.out.printf("%.0f", num);
                        }
                    }
                }
                break;
            }
            default: {
                System.out.println("Неправильный номер задания!");
                break;
            }
        }

        scanner.close();
    }
}