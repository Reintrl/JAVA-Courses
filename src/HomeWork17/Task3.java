package HomeWork17;

import java.util.function.Function;

public class Task3 {
    private static final double DOLLARTOBYN = 2.98;

    public static void main(String[] args) {
        String countBYN = "1200 BYN";
        Function<String, Double> converter = line -> {
            Double num = Double.parseDouble(line.substring(0, line.length() - 4));
            return num / DOLLARTOBYN;
        };

        System.out.println(converter.apply(countBYN));
    }
}
