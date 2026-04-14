import java.util.Arrays;

class BubbleSort {
    private int[] array;          // Mảng cần sắp xếp
    public int swaps;            // Số lần hoán đổi
    public int comparisons;      // Số lần so sánh

    /**
     * Hàm dựng để khởi tạo
     * @param array mảng đầu vào cần sắp xếp
     */
    public BubbleSort(int[] array) {
        this.array = array;
        this.swaps = 0;
        this.comparisons = 0;
    }

    /**
     * Hoán đổi hai phần tử trong mảng
     * @param i chỉ số phần tử thứ nhất
     * @param j chỉ số phần tử thứ hai
     */
    protected void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        swaps++;
    }

    /**
     * Sắp xếp mảng theo thứ tự tăng dần bằng thuật toán sắp xếp nổi bọt.
     *
     * Yêu cầu:
     * - Dùng hai vòng lặp lồng nhau.
     * - Vòng ngoài i chạy từ 0 đến n - 2.
     * - Vòng trong j chạy từ 0 đến n - 2 - i.
     * - Chỉ so sánh array[j] và array[j + 1].
     *
     * Thống kê:
     * - Mỗi phép so sánh array[j] > array[j + 1] tăng comparisons 1 lần.
     * - Nếu điều kiện đúng, phải gọi swap(j, j + 1).
     * - swaps chỉ được tăng trong hàm swap().
     *
     * Dừng sớm:
     * - Trong mỗi vòng ngoài phải theo dõi có swap hay không.
     * - Nếu một lần lặp không có hoán đổi, dừng thuật toán.
     *
     * Ràng buộc:
     * - Không dùng Arrays.sort() hoặc thuật toán khác.
     * - Không thay đổi thứ tự duyệt.
     */
    public void sort() {
        // TODO
    }

    @Override
    public String toString() {
        return "BubbleSort Result:\n" +
               "Array: " + Arrays.toString(array) + "\n" +
               "Comparisons: " + comparisons + "\n" +
               "Swaps: " + swaps;
    }
}