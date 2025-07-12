package HomeWork9.Task2_3;

public class Main {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[5];
        shapes[0] = new Triangle(1.2, 3.4, 2.35);
        shapes[1] = new Rectangle(3, 5);
        shapes[2] = new Circle(5);
        shapes[3] = new Circle(4.5);
        shapes[4] = new Triangle(10, 15, 14);

        Rectangle original = new Rectangle(3, 4);

        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.calculatePerimeter();
        }

        System.out.println("Сумма периметров всех фигур: " + totalPerimeter);

        Rectangle cloned = null;
        try {
            cloned = (Rectangle) original.clone();

            System.out.println("Original: " + original);
            System.out.println("Cloned:   " + cloned);

            System.out.println("Same object? - " + (original == cloned));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}