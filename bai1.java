public class bai1<T> { // Thêm <T> ở đây để dùng kiểu dữ liệu linh hoạt

    class Node {
        T data;    // Đổi int thành T để đồng bộ với hàm addFirst
        Node next;

        // Phải có Constructor này thì mới gọi new Node(data) được
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Phải khai báo biến head ở đây

    public void addFirst(T data) {
        Node newNode = new Node(data); 
        newNode.next = head; // Logic chuẩn: Nút mới trỏ vào đầu cũ
        head = newNode;      // Logic chuẩn: Cập nhật head là nút mới
    }
}