package HomeWork17;

import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {1, -4, 6, 1231, -23};

        Predicate<Integer> isPositive = num -> num > 0;
        for (int num : numbers) {
            if (isPositive.test(num))
                System.out.println(num);
        }
    }
}
