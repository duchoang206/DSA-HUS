import java.util.Arrays;

class HybridQuickSort {

    private int[] array;
    private int threshold;   // ngưỡng chuyển sang sắp xếp chèn

    /**
     * Hàm dựng
     * @param array mảng đầu vào
     * @param threshold ngưỡng chuyển sang sắp xếp chèn
     */
    public HybridQuickSort(int[] array, int threshold) {
        this.array = array;
        this.threshold = threshold;
    }

    /**
     * Phân hoạch mảng theo pivot cố định.
     *
     * Yêu cầu sau khi phân hoạch:
     * - Pivot phải nằm ở đúng vị trí trong mảng đã phân hoạch.
     * - Các phần tử nhỏ hơn pivot nằm bên trái pivot.
     * - Các phần tử lớn hơn pivot nằm bên phải pivot.
     * - Không yêu cầu sắp xếp hoàn chỉnh hai phía.
     *
     * @param low chỉ số bắt đầu của đoạn phân hoạch
     * @param high chỉ số kết thúc của đoạn phân hoạch
     * @return chỉ số vị trí cuối cùng của pivot
     */
    private int partition(int low, int high) {
        // TODO
        return -1;
    }

    /**
     * Cài đặt thuật toán sắp xếp chèn cho đoạn con của mảng
     * 
     * @param low chỉ số bắt đầu của đoạn
     * @param high chỉ số kết thúc của đoạn
     */
    private void insertionSort(int low, int high) {
        // TODO
    }

    /**
     * Sắp xếp mảng theo thứ tự tăng dần bằng thuật toán sắp xếp nhanh kết hợp 
     * sắp xếp chèn:
     *
     * Nếu (high - low + 1) <= threshold thì dùng thuật sắp xếp chèn
     * 
     * Nếu ngược lại thì thực hiện sắp nhanh bình thường
     */
    public void sort(int low, int high) {
        // TODO
    }

    @Override
    public String toString() {
        return "Hybrid Quick Sort Result:\n" +
               "Array: " + Arrays.toString(array);
    }
}