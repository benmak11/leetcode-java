package problemset.a1249;

import java.util.Stack;

public class MinRmToMakeValidParen {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(')
                stack.add(i);
            else if (arr[i] == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    arr[i] = ' ';
                }
            }
        }

        while(!stack.isEmpty()) {
            int index = stack.pop();
            if (arr[index] == '(' || arr[index] == ')')
                arr[index] = ' ';
        }

        StringBuilder ans = new StringBuilder();
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] != ' ')
                ans.append(arr[k]);
        }

        return ans.toString();
    }
}
