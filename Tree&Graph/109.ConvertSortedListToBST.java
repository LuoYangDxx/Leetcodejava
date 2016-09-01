public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);
        ListNode prehead = new ListNode(0);
        prehead.next = head;
        ListNode p = prehead;
        ListNode q = prehead;
        while (p.next != null && p.next.next != null) {
            p = p.next.next;
            q = q.next;
        }
        TreeNode root = new TreeNode(q.next.val);
        ListNode head2 = q.next.next;
        q.next = null;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(head2);
        return root;
    }
}