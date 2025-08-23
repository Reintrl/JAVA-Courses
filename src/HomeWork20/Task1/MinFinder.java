package HomeWork20.Task1;

public class MinFinder extends Finder {
    public MinFinder(int[] array) {
        super(array);
    }

    @Override
    public void run() {

        result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
    }
}
