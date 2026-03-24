package interviews.uber;

import java.util.*;

/**
 * We have a log of Uber rides when passengers shared their rides together through Uber Share.
 * The log is sorted chronologically
 *
 * 1670000001 Alice shared-ride-with Bob
 * 1670000042 Charlie shared-ride-with Dan
 * 1670000450 Bob shared-ride-with Charlie
 * 1670000501 Alice shared-ride-with Eve
 * 1670000621 Bob shared-ride-with Dan
 *
 * Given this log text and a list of all possible riders,
 * write a function that returns the earliest timestamp when all riders become connected through the car shared network.
 * A rider is connected to another if they have shared a ride, or if they are connected through a chain of other riders.
 *
 * Time: O(L · α(n)) || Space: O(n)
 */
public class LogEventStream_UnionFind {
    Map<String, String> parent = new HashMap<>();
    Map<String, Integer> rank = new HashMap<>();

    public String findConnectedTimestamp(String[] logs, int numRiders) {
        int components = 0;

        for (String log : logs) {
            String[] parts = log.split(" ");
            String timestamp = parts[0], rider1 = parts[1], rider2 = parts[3];

            if (!parent.containsKey(rider1)) {
                parent.put(rider1, rider1);
                rank.put(rider1, 0);
                components++;
            }
            if (!parent.containsKey(rider2)) {
                parent.put(rider2, rider2);
                rank.put(rider2, 0);
                components++;
            }

            if (union(rider1, rider2))
                components--;


            if (components == 1 && parent.size() == numRiders)
                return timestamp;
        }

        return "";
    }

    private String find(String x) {
        if (!parent.get(x).equals(x))
            parent.put(x, find(parent.get(x)));
        return parent.get(x);
    }

    private boolean union(String a, String b) {
        String pa = find(a), pb = find(b);

        if (pa.equals(pb))
            return false;

        if (rank.get(pa) < rank.get(pb))
            parent.put(pa, pb);
        else if (rank.get(pa) > rank.get(pb))
            parent.put(pb, pa);
        else {
            parent.put(pb, pa);
            rank.put(pa, rank.get(pa) + 1);
        }

        return true;
    }
}
