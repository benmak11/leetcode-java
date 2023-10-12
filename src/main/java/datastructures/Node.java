package datastructures;

public class Node extends ListNode {
    public Node (int _val) {
        this.val = _val;
    }

    public Node (int _val, Node _next) {
        this.val = _val;
        this.next = _next;
    }
}
