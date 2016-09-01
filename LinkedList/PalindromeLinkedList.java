public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode p = head;
        ListNode q = head;
        while (p.next!=null && p.next.next!=null) {
            p = p.next.next;
            q = q.next;
        }
        ListNode head2 = q.next;
        q.next = null;
        head2 = reverse(head2);
        return checkPalindrome(head, head2);
    }
    public ListNode reverse(ListNode head) {
        if (head == null) return null;
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
    public boolean checkPalindrome(ListNode head, ListNode head2) {
        while (head != null && head2 != null) {
            if (head.val != head2.val) return false;
            head = head.next;
            head2 = head2.next;
        }
        return true;
    }
}