public class QuickSort<T extends Comparable<T>> {

    private final T[] array;

    public QuickSort(T[] array) {
        this.array = array;
    }

    protected void swap(int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    /**
     * Phân hoạch mảng theo pivot bất kỳ cố định sao cho:
     * - Pivot phải nằm ở đúng vị trí trong mảng đã phân hoạch.
     * - Các phần tử nhỏ hơn pivot nằm bên trái pivot.
     * - Các phần tử lớn hơn pivot nằm bên phải pivot.
     * - Không yêu cầu sắp xếp hoàn chỉnh hai phía.
     *
     * @param low chỉ số bắt đầu của đoạn phân hoạch
     * @param high chỉ số kết thúc của đoạn phân hoạch
     * @return chỉ số vị trí cuối cùng của pivot
     */
    protected int partition(int low, int high) {
        // TODO
        return -1;
    }

    /**
     * Sắp xếp mảng theo thứ tự tăng dần bằng thuật toán sắp xếp nhanh
     * 
     * @param low chỉ số đầu
     * @param high chỉ số cuối
     */
    public void sort(int low, int high) {
        // TODO
    }

    public T[] getArray() {
        return array;
    }
}