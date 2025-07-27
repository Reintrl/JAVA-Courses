package HomeWork13.Task2;

public class Main {
    public static void main(String[] args) {
        // Вариант 1
        try {
            System.exit(0);
        } catch (Exception e) {
        } finally {
            System.out.println("Внутри блока finally");
        }


        // Вариант 2
//        try {
//            while (true) {
//
//            }
//        } catch (Exception e) {
//
//        } finally {
//            System.out.println("Внутри блока finally");
//        }
    }
}
