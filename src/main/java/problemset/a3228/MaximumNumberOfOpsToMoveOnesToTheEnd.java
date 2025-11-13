package problemset.a3228;

public class MaximumNumberOfOpsToMoveOnesToTheEnd {
    public int maxOperations(String s) {
        int res = 0, countOnes = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);

            if (curr == '1')
                countOnes++;
            else if (i > 0 && s.charAt(i - 1) == '1')
                res += countOnes;
        }
        return res;
    }
}
