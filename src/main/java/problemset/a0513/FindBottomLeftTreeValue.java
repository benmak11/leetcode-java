package problemset.a0513;

import datastructures.TreeNode;

import java.util.*;

public class FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        TreeNode node = null;
        while (!q.isEmpty()) {
            node = q.poll();

            if (node.right != null) q.offer(node.right);
            if (node.left != null) q.offer(node.left);
        }

        return node.val;
    }
}
