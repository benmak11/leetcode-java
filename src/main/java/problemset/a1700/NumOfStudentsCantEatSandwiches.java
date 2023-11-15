package problemset.a1700;

import java .util.*;
public class NumOfStudentsCantEatSandwiches {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();

        for (int j = 0; j < students.length; j++) q.offer(students[j]);

        int i = 0;
        while (!q.isEmpty()) {
            int n = q.size();
            boolean progress = false;

            for (int j = 0; j < n; j++) {
                int curr = q.poll();
                if (curr == sandwiches[i]) {
                    i++;
                    progress = true;
                } else
                    q.add(curr);
            }
            if (!progress) break;
        }
        return q.size();
    }
}
