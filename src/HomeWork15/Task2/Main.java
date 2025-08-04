package HomeWork15.Task2;

public class Main {
    public static void main(String[] args) {
        Animal animals = new Animal();
        animals.add("Tiger");
        animals.add("Mouse");

        System.out.println(animals);

        animals.remove();
        animals.add("Cat");
        animals.add("Horse");

        System.out.println(animals);
        animals.remove();
        System.out.println(animals);
    }
}