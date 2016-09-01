public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prehead = new ListNode(0);
        prehead.next = head;
        ListNode p = prehead;
        ListNode q = p.next;
        while (p.next != null) {
            while(q.next != null && q.val == q.next.val) {
                q = q.next;
            }
            if (p.next != q) {
                p.next = q.next;
                q = q.next;
            } else {
                p = p.next;
                q = q.next;
            }
        }
        return prehead.next;
    }
}