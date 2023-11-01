package problemset.a0501;

import datastructures.TreeNode;

import java.util.*;

public class FindModeInBinarySearchTree {

    /**
     *  DFS solution
     *
     *  Runtime Complexity: O(n)
     */
    private int mx;
    private int cnt;
    private TreeNode prev;
    private List<Integer> res;

    public int[] findMode(TreeNode root) {
        res = new ArrayList<>();
        dfs(root);
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); ++i) {
            ans[i] = res.get(i);
        }
        return ans;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        cnt = prev != null && prev.val == root.val ? cnt + 1 : 1;
        if (cnt > mx) {
            res = new ArrayList<>(Arrays.asList(root.val));
            mx = cnt;
        } else if (cnt == mx) {
            res.add(root.val);
        }
        prev = root;
        dfs(root.right);
    }

    /**
     * BFS Solution that passes on Leetcode
     * https://leetcode.com/problems/find-mode-in-binary-search-tree/submissions/1088835908
     *
     * Runtime Complexity: O(n) and worst case O(n log n)
     */
    public int[] bfs_findMode(TreeNode root) {
        if (root == null) return new int[0];
        List<Integer> curr = new ArrayList<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                if (freqMap.containsKey(node.val))
                    freqMap.put(node.val, freqMap.get(node.val) + 1);
                else
                    freqMap.put(node.val, 1);

                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
        }

        int currMax = 0;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > currMax) {
                curr.clear();
                curr.add(key);
                currMax = Math.max(currMax, value);
            } else if (value == currMax) {
                curr.add(key);
            }
        }

        int[] res = new int[curr.size()];
        for (int j = 0; j < curr.size(); j++) {
            res[j] = curr.get(j);
        }
        return res;
    }
}
