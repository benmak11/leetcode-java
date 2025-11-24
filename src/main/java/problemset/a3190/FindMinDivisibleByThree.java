package problemset.a3190;

public class FindMinDivisibleByThree {

    public int findMinimumOperations(int[] nums) {
        int res = 0;
        for (int n : nums) {
            if (n % 3 != 0)
                res++;
        }
        return res;
    }
}
