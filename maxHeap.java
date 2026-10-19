public class maxHeap {
    private int[] heap;
    private int capacity;
    private int size;

    public maxHeap(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity has to be greater than 0");
        }
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    private int getMax() {
        if (size == 0) {
            throw new IllegalArgumentException("There is no elements in the max heap");
        }
        return heap[0];
    }

    private void insert(int value) {
        if (size == capacity) {
            throw new IllegalArgumentException("Array is full");
        }
        heap[size] = value;
        heapifyUp(size);
        size++;
    }

    private int parent(int i) {
        return ((i-1) /2);
    }

    private void swap(int i,int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void heapifyUp(int index) {
        while (index > 0 && heap[index] > heap[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    private int removeMax() {
        if (size == 0) {
            throw new IllegalArgumentException("Size is 0");
        }
        int max = heap[0];
        heap[0] = heap[size-1];
        size--;
        if (size > 0) {
            heapifyDown(0);
        }
        return max;
    }

    private void heapifyDown(int index) {
        while (true) {
            int large = index;
            int left = leftChild(index);
            int right = rightChild(index);
            if (left < size && heap[left] > heap[large]) {
                large = left;
            }
            if (right < size && (heap[right]) > heap[large]) {
                large = right;
            }
            if (large == index) {
                break;
            }
            swap(index, large);
            index = large;
        }
    }

    public int leftChild(int i) {
        return ((2*i) + 1);
    }

    public int rightChild(int i) {
        return ((2*i) + 2);
    }
    public static void main(String[] args) {
        maxHeap heap1 = new maxHeap(10);
        heap1.insert(10);
        heap1.insert(5);
        heap1.insert(20);
        heap1.insert(25);
        heap1.getMax();
        System.out.println("max is " + heap1.getMax());
        System.out.println("Max removed: " + heap1.removeMax());
        System.out.println("max is " + heap1.getMax());
        
    }
}