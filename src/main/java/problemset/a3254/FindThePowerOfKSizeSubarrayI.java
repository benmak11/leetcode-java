package problemset.a3254;

public class FindThePowerOfKSizeSubarrayI {

    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length, idx = 0, i = 0, j = i + k - 1;
        int[] result = new int[n - k + 1];

        while (j < n) {
            if (checkIfConsecutive(i, j, nums))
                result[idx] = nums[j];
            else
                result[idx] = -1;

            idx++;
            i++;
            j++;
        }

        return result;
    }

    private boolean checkIfConsecutive(int i, int j, int[] nums) {
        int lead = i + 1;

        while (lead <= j) {
            int first = nums[lead];
            int sec = nums[lead - 1];
            if (sec < first && first - sec == 1)
                lead++;
            else
                return false;
        }
        return true;
    }
}
