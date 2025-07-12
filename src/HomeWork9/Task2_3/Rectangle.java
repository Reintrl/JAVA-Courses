package HomeWork9.Task2_3;

public class Rectangle extends Shape implements Cloneable {
    private double height;
    private double width;

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public double calculatePerimeter() {
        return (height + width) * 2;
    }

    // переопределяем чтобы можно было вызвать в другом классе, по умолчанию там protected
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
