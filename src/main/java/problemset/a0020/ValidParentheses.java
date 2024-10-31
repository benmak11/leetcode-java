package problemset.a0020;

import java.util.Stack;

public class ValidParentheses {

    public boolean validParentheses(String input) {
        char[] arr = input.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : arr) {
            if (c == '{') stack.push(c);
            if (c == '[') stack.push(c);
            if (c == '(') stack.push(c);

            if (c == '}') {
                if (stack.isEmpty()) return false;
                else if (stack.peek() == '{') stack.pop();
                else return false;
            }

            if (c == ']') {
                if (stack.isEmpty()) return false;
                else if (stack.peek() == '[') stack.pop();
                else return false;
            }

            if (c == ')') {
                if (stack.isEmpty()) return false;
                else if (stack.peek() == '(') stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }
}
