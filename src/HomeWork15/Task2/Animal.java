package HomeWork15.Task2;

import java.util.ArrayDeque;

public class Animal {
    private ArrayDeque<String> names = new ArrayDeque<>();

    public void add(String name) {
        names.addFirst(name);
    }

    public void remove() {
        names.removeLast();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "names=" + names +
                '}';
    }
}