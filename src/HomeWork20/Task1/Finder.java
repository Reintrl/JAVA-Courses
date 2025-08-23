package HomeWork20.Task1;

abstract public class Finder extends Thread {
    public int[] array;
    public int result;

    public Finder(int[] array) {
        this.array = array;
    }

    public int getResult() {
        return result;
    }
}
