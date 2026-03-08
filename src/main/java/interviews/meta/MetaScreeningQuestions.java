package interviews.meta;

import java.util.*;

public class MetaScreeningQuestions {

    public String resolvePath(String cwd, String cd) {
        Deque<String> stack = new ArrayDeque<>();
        String[] cwdSplit = cwd.split("/");
        String[] cdSplit = cd.split("/");

        if (cwdSplit.length == 0)
            stack.push("/");
        else {

            for (String s : cwdSplit)
                stack.push(s);
        }

        for (String s : cdSplit) {
            char c = s.charAt(0);

            if (Character.isLetter(c))
                stack.push(s);

            if (!stack.isEmpty() && s.equals(".."))
                stack.pop();

            if (s.equals("."))
                continue;
        }

        StringBuilder sb = new StringBuilder();

        if (stack.isEmpty())
            return "/";

        while (!stack.isEmpty()) {
            String curr = stack.pollLast();
            String suffix = stack.isEmpty() ? "" : "/";

            if (!curr.equals("/"))
                sb.append(curr).append(suffix);
            else
                sb.append(curr);
        }

        return sb.toString();
    }

    // A more optimal solution compared to the version above
    public String resolvePath2(String cwd, String cd) {
        Deque<String> stack = new ArrayDeque<>();

        for (String s : cwd.split("/"))
            if (!s.isEmpty()) stack.push(s);

        for (String s : cd.split("/")) {
            if (s.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else if (!s.isEmpty() && !s.equals(".")) {
                stack.push(s);
            }
        }

        if (stack.isEmpty()) return "/";

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.insert(0, "/" + stack.pollFirst());

        return sb.toString();
    }
}
