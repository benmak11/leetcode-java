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

    public TreeNode buildTree(String[] list) {
        if (list.length == 0)
            return null;

        return buildTreeHelper(list, 0);
    }

    private TreeNode buildTreeHelper(String[] list, int index) {
        if (index >= list.length)
                return null;

        if (list[index] == null)
            return null;

        int val = Integer.parseInt(list[index]);

        TreeNode node = new TreeNode(val);
        node.left = buildTreeHelper(list, 2 * index + 1);
        node.right = buildTreeHelper(list, 2 * index + 2);

        return node;
    }
}
