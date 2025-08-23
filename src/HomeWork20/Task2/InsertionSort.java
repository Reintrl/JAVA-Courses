package HomeWork20.Task2;

class InsertionSort extends SortAlgorithm {
    public InsertionSort(int[] array) {
        super(array);
    }

    @Override
    public void run() {
        System.out.println("Сортировка вставками начата");

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

        System.out.println("Сортировка вставками завершена");
    }
}