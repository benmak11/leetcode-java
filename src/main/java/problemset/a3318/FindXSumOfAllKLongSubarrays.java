package problemset.a3318;

import java.util.*;

public class FindXSumOfAllKLongSubarrays {

    record Pair(int num, int count) implements Comparable<Pair> {
        @Override
        public int compareTo(Pair other) {
            if (this.count != other.count)
                return other.count - this.count;
            return other.num - this.num;
        }
    }

    public int[] findXSumOfAllKLongSubarrays(int[] nums, int k, int x) {
        int n = nums.length;
        int[] res = new int[nums.length - k + 1];

        for (int i = 0; i < n - k + 1; i++) {
            Map<Integer, Integer> count = new HashMap<>();

            for (int j = i; j < i + k; j++)
                count.put(nums[j], count.getOrDefault(nums[j], 0) + 1);

            if (count.size() <= x) {
                int sum = 0;
                for (int j = i; j < i + k; j++)
                    sum += nums[j];
                res[i] = sum;
            } else {
                res[i] = count.entrySet().stream()
                        .map(e -> new Pair(e.getKey(), e.getValue()))
                        .sorted()
                        .limit(x)
                        .mapToInt(p -> p.num * p.count)
                        .sum();
            }
        }
        return res;
    }
}