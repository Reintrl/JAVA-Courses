package HomeWork20.Task2;

abstract class SortAlgorithm implements Runnable {
    public int[] array;

    public SortAlgorithm(int[] array) {
        this.array = array;
    }
}