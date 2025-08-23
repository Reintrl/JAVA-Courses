package HomeWork20.Task2;

class BubbleSort extends SortAlgorithm {
    public BubbleSort(int[] array) {
        super(array);
    }

    @Override
    public void run() {
        System.out.println("Сортировка пузырьком начата");

        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Сортировка пузырьком завершена");
    }
}