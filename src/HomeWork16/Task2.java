package HomeWork16;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String[] lines = {"man", "moon", "good", "night", "code", "bug"};
        Map<String, String> map = new HashMap<>();

        for (String line : lines) {
            if (!map.containsKey(line.substring(0, 0))) {
                map.put((line.substring(0, 1)), line.substring(line.length() - 1));
            }
        }

        System.out.println(map);
    }
}
