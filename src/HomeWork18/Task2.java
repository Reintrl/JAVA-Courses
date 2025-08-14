package HomeWork18;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> data = new HashMap<>();
        data.put(1, "Anna");
        data.put(2, "Bob");
        data.put(3, "Charlie");
        data.put(5, "David");
        data.put(8, "Eve");
        data.put(9, "Frank");
        data.put(13, "Grace");
        data.put(15, "Helen");

        Set<Integer> allowedIds = Set.of(1, 2, 5, 8, 9, 13);

        List<String> result = data.entrySet().stream()
                .filter(entry -> allowedIds.contains(entry.getKey()))
                .filter(entry -> entry.getValue().length() % 2 == 1)
                .map(entry -> new StringBuilder(entry.getValue()).reverse().toString())
                .toList();

        System.out.println(result);
    }
}
