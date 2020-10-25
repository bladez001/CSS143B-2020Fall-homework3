package Problem1;
//Timothy Muresan
public class ValidParentheses {

    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        if (str == null) {
            return true;
        }

        LinkedListStack<Character> stack = new LinkedListStack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }else if (c == ')' && stack.size() != 0 && stack.peek() == '(') {
                stack.pop();
            }else if (c == '}' && stack.size() != 0 && stack.peek() == '{') {
                stack.pop();
            }else if (c == ']' && stack.size() != 0 && stack.peek() == '[') {
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.size() == 0;
    }
}
