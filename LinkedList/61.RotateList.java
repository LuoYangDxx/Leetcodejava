/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        ListNode count = new ListNode(0);
        count = head;
        int len = 0;
        while (count != null) {
            count = count.next;
            len++;
        }
        k = k % len;
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode p = pre;
        ListNode q = pre;
        while (k > 0) {
            p = p.next;
            k--;
        }
        while (p.next !=null) {
            p = p.next;
            q = q.next;
        }
        p.next = head;
        head = q.next;
        q.next = null;
        return head;
    }
}