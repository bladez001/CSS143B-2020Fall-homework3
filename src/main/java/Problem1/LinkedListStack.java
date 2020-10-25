package Problem1;
//Timothy Muresan
import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variables
    private LinkedList<T> data;

    public LinkedListStack() {
        data = new LinkedList<>();
    }

    @Override
    public boolean push(T val) {
        data.push(val);
        return true;
    }

    @Override
    public T pop() {
        if (data.size() == 0) {
            return null;
        }
        T val = data.get(0);
        data.removeFirst();
        return val;
    }

    @Override
    public T peek() {
        return data.getFirst();
    }

    @Override
    public int size() {
        return data.size();
    }
}
