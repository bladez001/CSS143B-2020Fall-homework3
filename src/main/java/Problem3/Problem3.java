package Problem3;
//Timothy Muresan
import Problem1.LinkedListStack;
import Problem1.Stack;
import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        LinkedListStack<ListNode> newStack = new LinkedListStack();
        list = list.next;

        while (list != null) {
            newStack.push(list);
            list = list.next;
        }

        while (newStack.size() > 0) {
            print.println(newStack.peek().val);
            newStack.pop();
        }
    }
}
