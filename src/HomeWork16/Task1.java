package HomeWork16;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String[] lines = {"a", "a", "b", "c", "b", " ", " ", "h", "a"};
        Map<String, Boolean> map = new HashMap<>();

        for (String line : lines) {
            if (map.containsKey(line)) {
                map.replace(line, false, true);
            } else {
                map.put(line, false);
            }
        }

        System.out.println(map);
    }
}
