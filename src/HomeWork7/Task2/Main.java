package HomeWork7.Task2;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple.getColor());

        try {
            Field field = apple.getClass().getDeclaredField("color");
            field.setAccessible(true);
            field.set(apple, "Red");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(apple.getColor());
    }
}
