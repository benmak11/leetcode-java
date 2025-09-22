package problemset.a3005;

import java.util.*;

public class CountElementsWithMaximumFrequency {

    public int maxFrequencyElements(int[] nums) {
        int maxFreq = 0, maxCount = 0;
        Map<Integer, Integer> valueMap = new HashMap<>();

        for (int i : nums) {
            if (valueMap.containsKey(i))
                valueMap.put(i, valueMap.get(i) + 1);
            else
                valueMap.putIfAbsent(i, 1);

            int curr = valueMap.get(i);
            if (curr > maxFreq) {
                maxFreq = curr;
                maxCount = 1;
            } else if (curr == maxFreq)
                maxCount++;
        }
        return maxFreq * maxCount;
    }
}
