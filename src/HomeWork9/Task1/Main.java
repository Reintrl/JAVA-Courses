package HomeWork9.Task1;

public class Main {
    public static void main(String[] args) {
        PositionPrintable director = new Director();
        PositionPrintable worker = new Worker();
        PositionPrintable accountant = new Accountant();

        director.printPosition();
        worker.printPosition();
        accountant.printPosition();
    }
}
