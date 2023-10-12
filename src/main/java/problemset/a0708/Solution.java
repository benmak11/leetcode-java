package problemset.a0708;


import datastructures.Node;

public class Solution {
    public Node insert(Node head, int insertVal) {
        Node node = new Node(insertVal);
        if (head == null) {
            node.next = node;
            return node;
        }
        Node prev = head;
        Node curr = (Node) head.next;
        while (curr != head) {
            if ((prev.val <= insertVal && insertVal <= curr.val)
                    || (prev.val > curr.val && (insertVal >= prev.val || insertVal <= curr.val))){
                break;
            }
            prev = curr;
            curr = (Node) curr.next;
        }
        prev.next = node;
        node.next = curr;
        return head;
    }
}
