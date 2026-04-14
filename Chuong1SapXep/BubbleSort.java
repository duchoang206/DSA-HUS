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
        int n = array.length;
        for ( int i =0 ; i < n - i -1 ; i ++) {
            boolean swapped = false;
            for ( int j =0 ; i < n-j -1; j++) {
                if ( array[j].compareTo(array[j+1]) >0) {
                    swap (j , j+1);
                    swapped = true;
                } 
            } if (!swapped ) break;
        }
    }

    public T[] getArray() {
        return array;
    }
}