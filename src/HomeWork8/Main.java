package HomeWork8;

public class Main {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Rabbit rabbit = new Rabbit();
        Dog dog = Dog.createInstance();

        tiger.voice();
        tiger.eat("Grass");

        rabbit.voice();
        rabbit.eat("Grass");
        rabbit.eat("Apple");

        dog.voice();
        dog.eat("Meat");
    }
}
