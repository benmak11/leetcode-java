package problemset.a1261;

import datastructures.TreeNode;

import java.util.*;

public class FindingElements {

    Set<Integer> seen;

    public FindingElements(TreeNode root) {
        seen = new HashSet<>();
        bfs(root);
    }

    private void bfs(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        root.val = 0;
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode current = q.poll();

            seen.add(current.val);
            if (current.left != null) {
                current.left.val = (2 * current.val) + 1;
                q.offer(current.left);
            }
            if (current.right != null) {
                current.right.val = (2 * current.val) + 2;
                q.offer(current.right);
            }
        }
    }

    public boolean find(int target) {
        return seen.contains(target);
    }
}
