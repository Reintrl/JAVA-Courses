package HomeWork8;

public class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("*Пищит*");
    }

    @Override
    public void eat(String food) {
        switch (food) {
            case "Apple" -> System.out.println("Неплохой завтрак для зайца");
            case "Grass" -> System.out.println("Заяц доволен");
            default -> System.out.println("Заяц расстроен такой едой");
        }
    }

}
