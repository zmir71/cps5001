public class Queue {
    private final int[] queue;
    private int rear;
    private final int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        rear = -1;
    }

    public void enqueue(int item) {
        if (rear == capacity) {
            System.out.println("System Overflow");
        }
        queue[++rear] = item;
        return;
    }

    public void dequeue() {
        int size = queue.length;
        if (isEmpty()) {
            System.out.println("System Underflow");
        }
        int item = queue[0];
        for (int i = 1; i <= size-1; i++) {
            queue[i-1] = queue[i];
        }
        System.out.println(item);
        return;
    }

    public void peek() {
        if (queueSize() == 0 ) {
            System.out.println("System Underflow");
        }
         int item = queue[0];
         System.out.println(item);
         return;
    }

    public boolean isEmpty() {
         if (queueSize() == 0) {
            return true;
         } else {
            return false;
         }
    }

    public int queueSize() {
        int size = queue.length;
        return size;
    }

    public void display() {
        for (int item: queue) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(25);
        queue.enqueue(35);
        queue.dequeue();
        queue.display();

    }
}
