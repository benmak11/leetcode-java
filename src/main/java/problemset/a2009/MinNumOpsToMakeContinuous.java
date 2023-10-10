package problemset.a2009;

import java.util.Arrays;

public class MinNumOpsToMakeContinuous {
    public int minOperations(int[] nums) {
        int length = nums.length;
        int[] sorted = Arrays.stream(nums).distinct().sorted().toArray();
        int res = length, r = 0;

        for (int l = 0; l < sorted.length; l++) {
            // nums[l], nums[l] + length - 1 <- stop at the right of the range we're looking at
            while (r < sorted.length && sorted[r] < sorted[l] + length)
                r += 1;
            int window = r - l;
            res = Math.min(res, length - window);
        }
        return res;
    }
}
