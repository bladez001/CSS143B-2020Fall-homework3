package Problem1;
//Timothy Muresan
public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack

    ArrayStack<Integer> mins;

    public MinStack(int size) {
        super(size);
        mins = new ArrayStack(size);
    }

    @Override
    public boolean push(Integer val) {
        Integer minValue = mins.peek();
        if (minValue == null || val <= minValue) {
            mins.push(val);
        }
        return super.push(val);
    }

    @Override
    public Integer pop() {
        Integer min = mins.peek();
        Integer top = super.peek();

        if (top!= null && top.equals(min)) {
            mins.pop();
        }
        return super.pop();
    }

    public Integer getMin() {
        return mins.peek();
    }
}

