import java.util.Arrays;

class ThreeWayMergeSort {

    private int[] array;   // Mảng cần sắp xếp

    /**
     * Hàm dựng để khởi tạo
     * @param array mảng đầu vào
     */
    public ThreeWayMergeSort(int[] array) {
        this.array = array;
    }

    /**
     * Trộn 3 đoạn đã được sắp xếp:
     *
     * - [left, mid1]
     * - [mid1 + 1, mid2]
     * - [mid2 + 1, right]
     *
     * Sau khi thực hiện:
     * - Đoạn [left, right] phải được sắp xếp hoàn chỉnh.
     *
     * @param left  chỉ số bắt đầu
     * @param mid1  điểm chia thứ nhất
     * @param mid2  điểm chia thứ hai
     * @param right chỉ số kết thúc
     */
    public void merge(int left, int mid1, int mid2, int right) {
        // TODO
    }

    /**
     * Sắp xếp mảng theo thứ tự tăng dần bằng thuật toán sắp xếp trộn 3 nhánh:
     *
     * @param left  chỉ số đầu
     * @param right chỉ số cuối
     */
    public void sort(int left, int right) {
        // TODO
    }

    @Override
    public String toString() {
        return "Three-Way Merge Sort Result:\n" +
               "Array: " + Arrays.toString(array);
    }
}