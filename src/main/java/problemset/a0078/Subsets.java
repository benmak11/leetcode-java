package problemset.a0078;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Subsets {

    public List<List<Integer>> subsets (int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(ans, 0, nums, subset);
        return ans;
    }

    private void dfs(List<List<Integer>> ans, int i, int[] nums, List<Integer> subset) {
        if (i >= nums.length) {
            ans.add(new ArrayList<>(subset));
        } else {
            subset.add(nums[i]);
            dfs(ans, i + 1, nums, subset);

            subset.remove(subset.size() - 1);
            dfs(ans, i + 1, nums, subset);
        }
    }
}
