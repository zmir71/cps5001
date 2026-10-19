public class circularLinked {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node tail;

    public circularLinked() {
        tail = null;

    }

    

}