package datastructures;

import java.util.*;

public class TreeNode {
    public int val;
    public TreeNode left;
    public  TreeNode right;

    public TreeNode() {}

    public TreeNode(int _val) {
        this.val = _val;
    }

    public TreeNode(int _val, TreeNode _left, TreeNode _right) {
        this.val = _val;
        this.left = _left;
        this.right = _right;
    }

    public TreeNode buildTree(List<Integer> list) {
        if (list.size() == 0)
            return null;

        return buildTreeHelper(list, 0);
    }

    private TreeNode buildTreeHelper(List<Integer> list, int index) {
        if (index >= list.size())
                return null;

        TreeNode node = new TreeNode(list.get(index));
        node.left = buildTreeHelper(list, 2 * index + 1);
        node.right = buildTreeHelper(list, 2 * index + 2);
        return node;
    }
}
