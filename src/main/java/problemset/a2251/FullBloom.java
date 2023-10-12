package problemset.a2251;

import java.util.*;

public class FullBloom {

    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int[] res = new int[people.length];
        int count = 0;
        PriorityQueue<Integer> start = new PriorityQueue<>();
        PriorityQueue<Integer> end = new PriorityQueue<>();
        for (int[] flower : flowers) {
            start.add(flower[0]);
            end.add(flower[1]);
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < people.length; i++) {
            map.put(i, people[i]);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int p = entry.getValue();
            int i = entry.getKey();
            while (!start.isEmpty() && start.peek() <= p) {
                start.poll();
                count++;
            }
            while (!end.isEmpty() && end.peek() < p) {
                end.poll();
                count--;
            }

            res[i] = count;
        }
        return res;
    }
}
