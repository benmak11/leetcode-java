package practiceinterviews.hellointerview;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EvaluateQuery {


    public boolean evaluateQuery(String exp, int x) {
        List<String> tokens = tokenize(exp);
        Stack<String> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals(")")) {
                // Pop until we hit "("
                List<String> group = new ArrayList<>();
                while (!stack.peek().equals("(")) {
                    group.add(0, stack.pop());  // add to front to maintain order
                }
                stack.pop();  // remove the "("

                // Evaluate the group and push result
                String result = evaluateGroup(group, x);
                stack.push(result);
            } else {
                stack.push(token);
            }
        }

        return Boolean.parseBoolean(stack.pop());
    }

    private String evaluateGroup(List<String> group, int x) {
        // group is either: [X, <, 3] or [true, or, false]
        String left = group.get(0);
        String op = group.get(1);
        String right = group.get(2);

        boolean result;

        if (op.equals("and") || op.equals("or")) {
            // Logical operation
            boolean leftBool = Boolean.parseBoolean(left);
            boolean rightBool = Boolean.parseBoolean(right);
            result = evalLogical(leftBool, op, rightBool);
        } else {
            // Comparison operation
            int leftVal = resolveValue(left, x);
            int rightVal = resolveValue(right, x);
            result = evalComparison(leftVal, op, rightVal);
        }

        return String.valueOf(result);
    }

    private int resolveValue(String token, int x) {
        if (token.equals("X") || token.equals("x")) {
            return x;
        }
        return Integer.parseInt(token);
    }

    private boolean evalComparison(int left, String op, int right) {
        switch (op) {
            case "<":  return left < right;
            case ">":  return left > right;
            case "<=": return left <= right;
            case ">=": return left >= right;
            case "==": return left == right;
            default:   throw new IllegalArgumentException("Unknown operator: " + op);
        }
    }

    private boolean evalLogical(boolean left, String op, boolean right) {
        switch (op) {
            case "and": return left && right;
            case "or":  return left || right;
            default:    throw new IllegalArgumentException("Unknown operator: " + op);
        }
    }

    private List<String> tokenize(String exp) {
        List<String> tokens = new ArrayList<>();
        int i = 0;

        while (i < exp.length()) {
            char c = exp.charAt(i);

            // Skip whitespace
            if (c == ' ') {
                i++;
                continue;
            }

            // Parentheses
            if (c == '(' || c == ')') {
                tokens.add(String.valueOf(c));
                i++;
            }
            // Numbers
            else if (Character.isDigit(c)) {
                StringBuilder num = new StringBuilder();
                while (i < exp.length() && Character.isDigit(exp.charAt(i))) {
                    num.append(exp.charAt(i));
                    i++;
                }
                tokens.add(num.toString());
            }
            // Words: X, and, or
            else if (Character.isLetter(c)) {
                StringBuilder word = new StringBuilder();
                while (i < exp.length() && Character.isLetter(exp.charAt(i))) {
                    word.append(exp.charAt(i));
                    i++;
                }
                tokens.add(word.toString());
            }
            // Operators: <, >, <=, >=, ==
            else {
                StringBuilder op = new StringBuilder();
                op.append(c);
                i++;
                // Check for two-character operators
                if (i < exp.length() && exp.charAt(i) == '=') {
                    op.append('=');
                    i++;
                }
                tokens.add(op.toString());
            }
        }

        return tokens;
    }

//    public boolean evaluateQueryString(String query, int x) {
//        String exp = query.replace("X", String.valueOf(x));
//
//        exp = exp.trim();
//        if (exp.startsWith("(") && exp.endsWith(")"))
//            exp = exp.substring(1, exp.length() - 1);
//
//        return evaluate(exp);
//    }
//
//    private boolean evaluate(String exp) {
//        exp = exp.trim();
//
//        if (exp.startsWith("(")) {
//            int openCnt = 0;
//            for (int i = 0; i < exp.length(); i++) {
//                if (exp.charAt(i) == '(') openCnt++;
//                if (exp.charAt(i) == ')') openCnt--;
//                if (openCnt == 0) {
//                    String inner = exp.substring(1, i);
//                    boolean innerResult = evaluate(inner);
//                    String remaining = exp.substring(i + 1).trim();
//                    if (remaining.isEmpty())
//                        return innerResult;
//                    return evaluate(innerResult + " " + remaining);
//                }
//            }
//        }
//
//        if (exp.contains("&&")) {
//            String[] parts = exp.split("&&", 2);
//            return evaluate(parts[0]) && evaluate(parts[1]);
//        }
//        if (exp.contains("||")) {
//            String[] parts = exp.split("\\|\\|", 2);
//            return evaluate(parts[0]) && evaluate(parts[1]);
//        }
//
//        if (exp.contains("<=")) {
//            String[] parts = exp.split("<=", 2);
//            return Integer.parseInt(parts[0].trim()) <= Integer.parseInt(parts[1].trim());
//        }
//        if (exp.contains(">=")) {
//            String[] parts = exp.split(">=", 2);
//            return Integer.parseInt(parts[0].trim()) >= Integer.parseInt(parts[1].trim());
//        }
//        if (exp.contains("<")) {
//            String[] parts = exp.split("<", 2);
//            return Integer.parseInt(parts[0].trim()) < Integer.parseInt(parts[1].trim());
//        }
//        if (exp.contains(">")) {
//            String[] parts = exp.split(">", 2);
//            return Integer.parseInt(parts[0].trim()) > Integer.parseInt(parts[1].trim());
//        }
//        if (exp.contains("==")) {
//            String[] parts = exp.split("==", 2);
//            return Integer.parseInt(parts[0].trim()) == Integer.parseInt(parts[1].trim());
//        }
//        if (exp.contains("!=")) {
//            String[] parts = exp.split("!=", 2);
//            return Integer.parseInt(parts[0].trim()) != Integer.parseInt(parts[1].trim());
//        }
//
//        // If it's a single value, parse it as a boolean
//        return Boolean.parseBoolean(exp);
//    }
}
