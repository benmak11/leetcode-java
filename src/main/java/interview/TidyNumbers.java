package interview;

public class TidyNumbers {

    public int getTidyNumber(int n) {
        int i = 0;
        return lastTidyNumber(i, n);
    }
    public int lastTidyNumber(int i, long n) {
        String ns = String.valueOf(n);
        if (isTidy(ns)) return (int)n;

        int lastDigit = Integer.parseInt(String.valueOf(ns.charAt(ns.length() - 1 - i))) + 1;

        long subs = (long) Math.pow(10, i) * lastDigit;
        i++;
        return lastTidyNumber(i, n - subs);
    }

    private boolean isTidy(String ns) {
        int max = Integer.parseInt(String.valueOf(ns.charAt(0)));

        for (int i = 1; i < ns.length(); i++) {
            int c = Integer.parseInt(String.valueOf(ns.charAt(i)));
            if (c < max) return false;
            else max = c;
        }
        return true;
    }
}
