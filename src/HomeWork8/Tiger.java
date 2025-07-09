package HomeWork8;

public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("РРРРР!");
    }

    @Override
    public void eat(String food) {
        switch (food) {
            case "Meat" -> System.out.println("Тигр доволен");
            default -> System.out.println("Тигр такое не ест");
        }
    }

}
