package problemset.a2337;

import java.util.*;

public class MovePiecesToObtainAString {

    public boolean canChange(String start, String target) {
        List<int[]> startPosList = parseString(start);
        List<int[]> targetPosList = parseString(target);

        if (startPosList.size() != targetPosList.size())
            return false;

        for (int i = 0; i < startPosList.size(); i++) {
            int[] startPos = startPosList.get(i);
            int[] targetPos = targetPosList.get(i);

            int sPos = startPos[0], tPos = targetPos[0], sPos2 = startPos[1], tPos2 = targetPos[1];

            if (sPos != tPos)
                return false;

            if (sPos == 1 && sPos2 < tPos2)
                return false;

            if (sPos == 2 && sPos2 > tPos2)
                return false;
        }

        return true;
    }

    private List<int[]> parseString(String s) {
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == 'L')
                res.add(new int[] {1, i});
            else if (current == 'R')
                res.add(new int[] {2, i});
        }
        return res;
    }
}
