public class BubbleSort<T extends Comparable<T>> {

    private final T[] array;

    public BubbleSort(T[] array) {
        this.array = array;
    }

    protected void swap(int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    /**
     * Sắp xếp mảng theo thứ tự tăng dần bằng thuật toán sắp xếp nổi bọt
     */
    public void sort() {
        // TODO
    }

    public T[] getArray() {
        return array;
    }
}