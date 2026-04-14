import java.util.Arrays;

class InsertionSort {
    private double[] array;       // Mảng số thực cần sắp xếp
    public long comparisons;      // Số lần so sánh
    public long shifts;           // Số lần dịch chuyển phần tử

    /**
     * Hàm dựng để khởi tạo
     * @param array mảng số thực đầu vào cần sắp xếp
     */
    public InsertionSort(double[] array) {
        this.array = array;
        this.comparisons = 0;
        this.shifts = 0;
    }

    /**
     * Sắp xếp mảng bằng thuật toán sắp xếp chèn.
     *
     * Yêu cầu:
     * - Dùng cơ chế chèn, không chọn min/max toàn mảng.
     * - Vòng lặp i chạy từ 1 đến n - 1.
     * - key = array[i].
     * - Duyệt j từ i - 1 về 0.
     *
     * Quy tắc so sánh:
     * - Mỗi phép so sánh key > array[j] tăng comparisons 1 lần.
     *
     * Quy tắc dịch chuyển:
     * - Nếu key > array[j], dịch array[j] sang phải.
     * - Mỗi lần dịch tăng shifts 1 lần.
     *
     * Thứ tự sắp xếp:
     * - Sắp xếp giảm dần.
     *
     * Ràng buộc:
     * - Không dùng Arrays.sort() hoặc thuật toán khác.
     * - Không thay đổi hướng duyệt.
     *
     * Kết quả:
     * - Mảng sau khi sắp xếp phải giảm dần.
     */
    public void sort() {
        // TODO
    }

    @Override
    public String toString() {
        return "InsertionSort Result:\n" +
               "Array: " + Arrays.toString(array) + "\n" +
               "Comparisons: " + comparisons + "\n" +
               "Shifts: " + shifts;
    }
}