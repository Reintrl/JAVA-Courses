package HomeWork17;

import java.util.function.Consumer;

public class Task4 {
    private static final double DOLLARTOBYN = 2.98;

    public static void main(String[] args) {
        String countBYN = "1200 BYN";
        Consumer<String> converter = line -> {
            Double num = Double.parseDouble(line.substring(0, line.length() - 4));
            System.out.println(num / DOLLARTOBYN);
        };

        converter.accept(countBYN);
    }
}
