import java.util.Comparator;

public class MergeSort<T> {

    private final T[] array;
    private final Comparator<T> comparator;

    public MergeSort(T[] array, Comparator<T> comparator) {
        this.array = array;
        this.comparator = comparator;
    }

    /**
     * Trộn hai đoạn đã được sắp xếp của mảng:
     * [left, mid] và [mid + 1, right]
     *
     * Sau khi trộn:
     * - Đoạn [left, right] phải được sắp xếp theo thứ tự tăng dần
     *
     * @param left  chỉ số bắt đầu của đoạn thứ nhất
     * @param mid   chỉ số kết thúc của đoạn thứ nhất
     * @param right chỉ số kết thúc của đoạn thứ hai
     */
    protected void merge(int left, int mid, int right) {
        // TODO
    }

    /**
     * Sắp xếp mảng theo thứ tự tăng dần theo thuật toán sắp xếp trộn
     *
     * @param left  chỉ số bắt đầu
     * @param right chỉ số kết thúc
     */
    public void sort(int left, int right) {
        // TODO
    }

    public T[] getArray() {
        return array;
    }
}