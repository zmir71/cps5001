public class Queue {
    private final int[] queue;
    private int size;
    private final int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        size = 0;
    }

    public void enqueue(int item) {
        if (capacity == -1) {
            System.out.println("System Overflow");
        }
        queue[size] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("System Underflow");
        }
        int item = queue[0];
        for (int i = 0; i < size-1; i++) {
            queue[i] = queue[i+1];
        };
        size--;
        queue[size] = 0;
        return item;
    }

    public int peek() {
        if (queueSize() == 0 ) {
            System.out.println("System Underflow");
        }
        System.out.println(queue[size]);
        return queue[size];
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
