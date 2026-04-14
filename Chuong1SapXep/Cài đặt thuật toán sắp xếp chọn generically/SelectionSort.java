import java.util.Comparator;

public class SelectionSort<T> {

    private final T[] array;
    private final Comparator<T> comparator;

    public SelectionSort(T[] array, Comparator<T> comparator) {
        this.array = array;
        this.comparator = comparator;
    }
    
    private void swap(int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Sắp xếp mảng theo thứ tự tăng dần theo thuật toán sắp xếp chọn
     */
    public void sort() {
        // TODO
    }

    public T[] getArray() {
        return array;
    }
}