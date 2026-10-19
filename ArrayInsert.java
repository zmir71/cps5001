public class ArrayInsert {
    private int[] arr;
    private int size;          
    private final int capacity;     

    public ArrayInsert(int capacity) {   
        this.capacity = capacity; 
        this.arr = new int[capacity];
        this.size = 0;
    }

    public void insert(int element) {
        if (size == capacity) {  
            resize();
        }
        arr[size] = element;   
        size++;              
    }

    public void resize() {
        int newCapacity = capacity * 2;
        int[] newArr = new int[newCapacity];
        System.arraycopy(arr, 0, newArr, 0, size);
        arr = newArr;
    } 

    public void display() {
        if (size == 0) {
            System.out.println("The list is empty");
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public boolean delete(int element) {
        int index = search(element);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < size -1; i++) {
            arr[i] = arr[i+1];
        }
        return false;
    }

    public int search(int element) {
        for (int i=0; i < size; i++ ) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
public void main(String[] args) {
    ArrayInsert Arr = new ArrayInsert(5);
    Arr.insert(14);
    Arr.insert(15);
    Arr.insert(16);
    Arr.insert(17);
    Arr.insert(18);
    Arr.insert(19);
    Arr.display();
}


