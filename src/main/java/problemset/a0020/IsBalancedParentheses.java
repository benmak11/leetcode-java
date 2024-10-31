package problemset.a0020;

import java.util.*;

/**
 * Meta (Phone screen question)
 * You are given an input string and a matrix array of brackets, and you
 * need to validate that the string has a set of balanced brackets (True or False).
 * By Balanced  we mean that each adjacent bracket is its set of opening
 * and closing brackets.
 * <p>
 * TestCase 1
 * input: "some string"  brackets: '[', ']'; '{', '}'; '(', ')'; '<', '>'
 * output: true
 * <p>
 * TestCase 2
 * input: "[abcdef"  brackets: '[', ']'; '{', '}'; '(', ')'; '<', '>'
 * output: false
 */
public class IsBalancedParentheses {

    public boolean isBalanced(String input, char[][] brackets) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> closingBrackets = new HashSet<>();
        Stack<Character> stack = new Stack<>();

        for (char[] bracket : brackets) {
            map.put(bracket[0], bracket[1]);
            closingBrackets.add(bracket[1]);
        }

        char[] arr = input.toCharArray();

        for (char c : arr) {
            if (!Character.isDigit(c) && !Character.isAlphabetic(c)) {
                if (map.containsKey(c)) stack.push(c);

                if (closingBrackets.contains(c)) {
                    if (stack.isEmpty()) return false;
                    else if (map.get(stack.peek()) == c) stack.pop();
                    else return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
