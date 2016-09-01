public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode p = new ListNode(0);
        p.next = head;
        ListNode q = p;
        while (p!= null) {
            while (p.next != null && p.next.val == val) {
                p.next = p.next.next;
            }
            p = p.next;
        }
        return q.next;
    }
}