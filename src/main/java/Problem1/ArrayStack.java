package Problem1;
//Timothy Muresan
public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;

    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        if (capacity > 0) {
            this.size = capacity;
            this.data = (T[]) new Object[capacity];
        }
        size = 0;
    }

    @Override
    public boolean push(T val) {
        if (data == null || data.length == 0 || size == data.length) {
            return false;
        }
        data[size] = val;
        size++;
        return true;
    }

    @Override
    public T pop() {
        if (size == 0){
            return null;
        }
        T val = data[size-1];
        size--;
        return val;
    }

    @Override
    public T peek() {
        if (size <= 0) {
            return null;
        }
        return data[size-1];
    }

    @Override
    public int size() {
        return size;
    }
}
