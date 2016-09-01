public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = head;
        ListNode q = head;
        while (p.next != null && p.next.next != null) {
            p = p.next.next;
            q = q.next;
        }
        ListNode head2 = q.next;
        q.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(head2);
        return merge(left, right);
    }
    public ListNode merge(ListNode left, ListNode right) {
        ListNode pre = new ListNode(0);
        ListNode prehead = pre;
        while (left != null && right != null) {
           if (left.val < right.val) {
               pre.next = left;
               left = left.next;
               pre = pre.next;
           } else {
               pre.next = right;
               right = right.next;
               pre = pre.next;
           } 
        }
        if (left != null) {
            pre.next = left;
        }
        if (right != null) {
            pre.next = right;
        }
        return prehead.next;
    }
}