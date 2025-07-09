package HomeWork8;

public class Dog extends Animal {
    private Dog() {
    }

    @Override
    public void voice() {
        System.out.println("Гав!");
    }

    @Override
    public void eat(String food) {
        switch (food) {
            case "Meat" -> System.out.println("Собака довольна");
            case "Fish" -> System.out.println("Собака боится пробовать что-то незнакомое");
            default -> System.out.println("Собака такое не ест");
        }
    }

    public static Dog createInstance() {
        return new Dog();
    }
}