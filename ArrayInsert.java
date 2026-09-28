public class ArrayInsert {
    private int arr;
    private int size;           #Num of elements present 
    private int capacity;       #Total number of elements possible to insert in array

    public ArrayInsert(int capacity) {    #Constructor method
        this.capacity = capacity; 
        this.arr = new int[capacity];
        this.size = 0;
    }

    public void insert(int element) {
        if (size == capacity) {   #Need to resize array
            resize();
        }
        arr[size] = element;    #Insert at end of Array
        size++ ;                #Increment the size to updated size
    }

    public resize() {
        newCapacity = capacity * 2;
        int[] newArr = new int[newCapacity];
        for (int i = 0, i < size, i++ ) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    } 

    public display() {
        if (size = 0) {
            System.out.println(arr[i]);
        }
    }
}
public static void main(String[] args) {
    ArrayInsert Arr = new ArrayInsert(capacity: 5);
    Arr.insert(14);
    Arr.insert(15);
    Arr.insert(16);
    Arr.insert(17);
    Arr.insert(18);
    Arr.insert(19);
    Arr.display()
}


