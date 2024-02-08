package problemset.a0150;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token: tokens) {
            if (token.length() > 1 || Character.isDigit(token.charAt(0))) {
                stack.push(Integer.parseInt(token));
            } else {
                int secondOp = stack.pop();
                int firstOp = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(firstOp + secondOp);
                        break;
                    case "-":
                        stack.push(firstOp - secondOp);
                        break;
                    case "*":
                        stack.push(firstOp * secondOp);
                        break;
                    case "/":
                        stack.push(firstOp / secondOp);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
