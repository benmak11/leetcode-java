package datastructures;

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
}
