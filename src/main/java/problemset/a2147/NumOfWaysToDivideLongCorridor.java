package problemset.a2147;

import java.util.ArrayList;
import java.util.List;

public class NumOfWaysToDivideLongCorridor {
    public int numberOfWays(String corridor) {
        int mod = (int) 1e9 + 7;
        List<Integer> seats = new ArrayList<>();
        for (int i = 0; i < corridor.length(); i++) {
            if (corridor.charAt(i) == 'S')
                    seats.add(i);
        }

        int len = seats.size(), res = 1;
        if (len < 2 || len % 2 == 1) return 0;

        for (int idx = 1; idx < len - 1; idx += 2)
            res = (res * (seats.get(idx + 1) - seats.get(idx)) % mod);

        return res;
    }
}
