import java.util.ArrayList;
public class minHeap {
    private int[] heap;
    private int capacity;
    private int size;
    private int d;

    public minHeap(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity has to be greater than 0");
        }
        if (d < 2) {
            throw new IllegalArgumentException("You must have depth greter than 2");
        }
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
        this.d = d;
    }

    private int getMin() {
        if (size == 0) {
            throw new IllegalArgumentException("Size has to be greater than 0");
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

    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = ((index -1) / d);
            if (heap[index] >= heap[parent]) {
                break;
            }
            swap(index, parent);
            index = parent;
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void heapifyDown(int index) {
        while (true) {
            int smallest = index;
            for (int i = 0; i <= d; i++) {
                int child = d* index + i;
                if (child < size && heap[child] < heap[smallest]) {
                    smallest = child;  
                }
            }
            if (smallest == index) {
                break;
            }
            swap(index, smallest);
        }
    }

    private int removeMin() {
        if (size == 0) {
            throw new IllegalArgumentException("Size has to be greater than 0");
        }
        int min = heap[0];
        heap[0] = heap[size-1];
        size--;
        if (size > 0) {
            heapifyDown(0);
        }
        return min;


    private List<Integer> getHeap() {
        List<Integer> result = new ArrayList<>();
        System.arraycopy(heap, 0, result, 0, size-1);
        return result;
    }

    private static void main(String[] args) {
        minHeap Heap = new minHeap(10);
        Heap.d = 3;
        Heap.insert(15);
        Heap.insert(10);
        Heap.insert(20);
        Heap.insert(8);
        Heap.insert(25);
        Heap.getMin();
        Heap.removeMin();
        System.out.println("heap after iteration " + Heap.getHeap());


    }

}