import bai1.Node;

public int findMax() {
    if ( head == null ) {
        throw new IndexOutOfBoundsException();
    }
    int max = head.data;
    else {
        Node current = head;
        while ( !current == null ) {
            if ( current.data > max) {
                max = current.data;
            } 
            current = current.next
        } return max;
    }
}