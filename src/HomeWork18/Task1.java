package HomeWork18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                1, 2, 3, 4, 5, 6, 2, 4, 6, 8, 10, 10, 12, 3, 7
        ));

        Optional<Integer> sum = numbers.stream()
                .distinct()
                .filter(num -> num % 2 == 0)
                .peek(n -> System.out.print(n + " "))
                .reduce(Integer::sum);

        System.out.println("\n" + sum);
    }
}
