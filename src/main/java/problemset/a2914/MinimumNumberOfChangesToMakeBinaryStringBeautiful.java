package problemset.a2914;

public class MinimumNumberOfChangesToMakeBinaryStringBeautiful {

    public int minChanges(String s) {
        int res = 0;
        char[] ch = s.toCharArray();
        for (int r = 0; r < ch.length; r += 2) {
            if (ch[r] != ch[r + 1])
                res++;
        }
        return res;
    }
}
