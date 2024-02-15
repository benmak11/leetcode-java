package problemset.a2971;

import java.util.Arrays;

public class FindPolygonWIthTheLargestPerimeter {

    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long res = -1, total = 0;

        for (int n : nums) {
            if (total > n)
                res = total + n;
            total += n;
        }
        return res;
    }
}
