import java.util.Arrays;

class SelectionSort {
    private String[] array;       // Mảng chuỗi cần sắp xếp
    public long swaps;            // Số lần hoán đổi
    public long comparisons;      // Số lần so sánh

    /**
     * Hàm dựng để khởi tạo 
     * @param array mảng chuỗi đầu vào cần sắp xếp
     */
    public SelectionSort(String[] array) {
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
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        swaps++;
    }

    /**
     * Sắp xếp mảng theo thứ tự từ điển bằng thuật toán sắp xếp chọn.
     *
     * Yêu cầu:
     * - Dùng hai vòng lặp lồng nhau.
     * - Vòng ngoài i chạy từ 0 đến n - 2.
     * - Vòng trong j chạy từ i + 1 đến n - 1.
     * - Tìm phần tử nhỏ nhất theo thứ tự từ điển.
     *
     * Thống kê:
     * - Mỗi phép so sánh dùng compareTo() tăng comparisons 1 lần.
     * - Chỉ đổi chỗ khi minIndex khác i.
     * - Đảm bảo số hoán đổi là tối thiểu.
     *
     * Ràng buộc:
     * - Không dùng Arrays.sort() hoặc thuật toán khác.
     * - Không hoán đổi một cách dư thừa.
     */
    public void sort() {
        // TODO
    }

    @Override
    public String toString() {
        return "SelectionSort Result:\n" +
               "Array: " + Arrays.toString(array) + "\n" +
               "Comparisons: " + comparisons + "\n" +
               "Swaps: " + swaps;
    }
}