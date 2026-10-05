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

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        System.out.println(stack[top]);
        return stack[top];
    }

    public boolean isFull() {
        if (capacity == -1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty() {
        return capacity == -1;
    }
    public void display() {
        for (int item: stack) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(25);
        stack.push(35);
        stack.pop();
        stack.push(40);
        stack.peek();
        stack.display();

    }
}
