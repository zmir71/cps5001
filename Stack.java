public class Stack {
    private final int[] stack;
    private int top;
    private final int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = data;
    }

    public boolean isFull() {
        if (capacity == stack.length) {
            return true;
        } else {
            return false;
        }
    }
}
