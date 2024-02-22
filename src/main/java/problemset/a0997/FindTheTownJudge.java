package problemset.a0997;

import java.util.HashMap;
import java.util.Map;

public class FindTheTownJudge {

    public int findJudge(int n, int[][] trust) {
        Map<Integer, Integer> inc = new HashMap<>();
        Map<Integer, Integer> out = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            inc.put(i, 0);
            out.put(i, 0);
        }

        for (int[] arr : trust) {
            int p1 = arr[0];
            int p2 = arr[1];

            inc.put(p2, inc.getOrDefault(p2, 0) + 1);
            out.put(p1, out.getOrDefault(p1, 0) + 1);
        }

        for (int i = 1; i <= n; i++) {
            if (inc.get(i) == n - 1 && out.get(i) == 0) return i;
        }
        return -1;
    }
}
