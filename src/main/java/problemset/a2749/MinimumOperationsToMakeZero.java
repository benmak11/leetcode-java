package problemset.a2749;

public class MinimumOperationsToMakeZero {
    public int makeTheIntegerZero(int num1, int num2) {
        for (long k = 1; ; k++) {
            long targetSum = num1 - k * num2;

            if (targetSum < 0)
                break;

            if (Long.bitCount(targetSum) <= k && targetSum >= k)
                return (int) k;
        }
        return -1;
    }
}
