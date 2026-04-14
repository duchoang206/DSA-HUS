import java.util.Arrays;

class CountingSort {

    private int[] array;   // Mảng đầu vào
    private int k;         // Giá trị lớn nhất trong mảng (0 <= array[i] <= k)


    public CountingSort(int[] array, int k) {
        this.array = array;
        this.k = k;
    }

    /**
     * Sắp xếp mảng theo thứ tự tăng dần bằng thuật toán sắp xếp đếm
     * 
     * 1. Tạo mảng count kích thước k + 1
     * 2. Đếm số lần xuất hiện
     * 3. Ghi lại array theo thứ tự tăng dần
     */
    public void sort() {
        // TODO
    }

    @Override
    public String toString() {
        return "Counting Sort Result:\n" +
               "Array: " + Arrays.toString(array);
    }
}