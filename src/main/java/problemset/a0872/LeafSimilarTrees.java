package problemset.a0872;

import datastructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> leaf1 = new ArrayList<>();
        ArrayList<Integer> leaf2 = new ArrayList<>();
        dfs(root1, leaf1);
        dfs(root2, leaf2);
        return leaf1.equals(leaf2);
    }

    private void dfs(TreeNode root, List<Integer> ls) {
        if (root == null) return;
        if (root.left == null && root.right == null) ls.add(root.val);
        dfs(root.left, ls);
        dfs(root.right, ls);
    }
}
