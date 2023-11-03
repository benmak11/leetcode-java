package problemset.a1441;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOpaerations {

    public List<String> buildArray(int[] target, int n) {
        int curr = 0;
        List<String> res = new ArrayList<>();
        for (int v : target) {
            while (++curr < v) {
                res.add("Push");
                res.add("Pop");
            }
            res.add("Push");
        }
        return res;
    }
}
