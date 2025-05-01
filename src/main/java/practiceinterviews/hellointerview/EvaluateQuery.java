package practiceinterviews.hellointerview;

public class EvaluateQuery {

    public boolean evaluateQueryString(String query, int x) {
        String exp = query.replace("X", String.valueOf(x));

        exp = exp.trim();
        if (exp.startsWith("(") && exp.endsWith(")"))
            exp = exp.substring(1, exp.length() - 1);

        return evaluate(exp);
    }

    private boolean evaluate(String exp) {
        exp = exp.trim();

        if (exp.startsWith("(")) {
            int openCnt = 0;
            for (int i = 0; i < exp.length(); i++) {
                if (exp.charAt(i) == '(') openCnt++;
                if (exp.charAt(i) == ')') openCnt--;
                if (openCnt == 0) {
                    String inner = exp.substring(1, i);
                    boolean innerResult = evaluate(inner);
                    String remaining = exp.substring(i + 1).trim();
                    if (remaining.isEmpty())
                        return innerResult;
                    return evaluate(innerResult + " " + remaining);
                }
            }
        }

        if (exp.contains("&&")) {
            String[] parts = exp.split("&&", 2);
            return evaluate(parts[0]) && evaluate(parts[1]);
        }
        if (exp.contains("||")) {
            String[] parts = exp.split("\\|\\|", 2);
            return evaluate(parts[0]) && evaluate(parts[1]);
        }

        if (exp.contains("<=")) {
            String[] parts = exp.split("<=", 2);
            return Integer.parseInt(parts[0].trim()) <= Integer.parseInt(parts[1].trim());
        }
        if (exp.contains(">=")) {
            String[] parts = exp.split(">=", 2);
            return Integer.parseInt(parts[0].trim()) >= Integer.parseInt(parts[1].trim());
        }
        if (exp.contains("<")) {
            String[] parts = exp.split("<", 2);
            return Integer.parseInt(parts[0].trim()) < Integer.parseInt(parts[1].trim());
        }
        if (exp.contains(">")) {
            String[] parts = exp.split(">", 2);
            return Integer.parseInt(parts[0].trim()) > Integer.parseInt(parts[1].trim());
        }
        if (exp.contains("==")) {
            String[] parts = exp.split("==", 2);
            return Integer.parseInt(parts[0].trim()) == Integer.parseInt(parts[1].trim());
        }
        if (exp.contains("!=")) {
            String[] parts = exp.split("!=", 2);
            return Integer.parseInt(parts[0].trim()) != Integer.parseInt(parts[1].trim());
        }

        // If it's a single value, parse it as a boolean
        return Boolean.parseBoolean(exp);
    }
}
