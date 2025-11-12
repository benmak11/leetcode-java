package problemset.a3607;

import java.util.*;

public class PowerGridMaintenance {
    Map<Integer, List<Integer>> adj = new HashMap<>();
    Set<Integer> online = new HashSet<>();
    Map<Integer, Integer> stationGroup = new HashMap<>();
    Map<Integer, PriorityQueue<Integer>> minHeap = new HashMap<>();

    public int[] processQueries(int c, int[][] connections, int[][] queries) {

        for (int[] connection: connections) {
            int u = connection[0];
            int v = connection[1];

            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        // build connected components
        for (int s = 1; s < c + 1; s++) {
            dfs(s, s);
        }

        List<Integer> gather = new ArrayList<>();

        for (int[] query : queries) {
            int type = query[0];
            int station = query[1];

            if (type == 1) {
                if (online.contains(station)) {
                    gather.add(station);
                    continue;
                }
                int groupId = stationGroup.get(station);
                PriorityQueue<Integer> pq = minHeap.get(groupId);
                while (pq != null && !pq.isEmpty() && !online.contains(pq.peek())) {
                    pq.poll();
                }
                if (!pq.isEmpty()) {
                    gather.add(pq.peek());
                } else {
                    gather.add(-1);
                }
            } else {
                online.remove(station);
            }
        }

        return gather.stream().mapToInt(Integer::intValue).toArray();
    }

    private void dfs(int station, int groupId) {
        if (online.contains(station))
            return;

        online.add(station);
        stationGroup.put(station, groupId);
        minHeap.computeIfAbsent(groupId, k -> new PriorityQueue<>()).add(station);

        for (int nei : adj.getOrDefault(station, new ArrayList<>())) {
            dfs(nei, groupId);
        }
    }
}
