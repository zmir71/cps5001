public class singlyLinked {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;


    public singlyLinked() {
        head = null;

    }
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
        current.next = newNode;
        }
    }
    public void display() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.data + "");
            current = current.next;
        }
    }
    public void delete(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        Node previous = null;
        while (current.next != null && current.data != data) {
            previous = current;
            current = current.next;
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    public static void main(String[] args) {
        singlyLinked single = new singlyLinked();
        single.insert(10);
        single.insert(20);
        single.insert(30);
        single.insert(40);
        single.delete(10);
    }
}