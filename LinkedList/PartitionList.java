/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ListNode a = new ListNode(0);
        ListNode b = new ListNode(0);
        ListNode c = a;
        ListNode d = b;
        while (head != null) {
            if (head.val < x) {
                a.next = head;
                a = a.next;
            } else {
                b.next = head;
                b = b.next;
            }
            head = head.next;
        }
        a.next = d.next;
        b.next = null;
        return c.next;
    }
}