package problemset.a0227;

import java.util.Stack;

public class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        char sign = '+';
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c))
                val = val * 10 + (c - '0');

            if (i == s.length() - 1 || c == '+' || c == '-' || c == '*' || c == '/') {
                if (sign == '+')
                    stack.push(val);
                else if (sign == '-')
                    stack.push(-val);
                else if (sign == '*')
                    stack.push(stack.pop() * val);
                else
                    stack.push(stack.pop() / val);

                sign = c;
                val = 0;
            }
        }

        int res = 0;
        while (!stack.isEmpty())
            res += stack.pop();

        return res;
    }
}
