package problemset.a1513;

public class NumberOfSubstringsWithOnlyOnes {
    final int MODULO = (int) 1e9 + 7;

    public int numSub(String s) {
        int res = 0, consecutiveOnes = 0;

        for (char c : s.toCharArray()) {
            if (c == '1')
                consecutiveOnes++;
            else
                consecutiveOnes = 0;

            res = (res + consecutiveOnes) % MODULO;
        }
        return res;
    }
}
