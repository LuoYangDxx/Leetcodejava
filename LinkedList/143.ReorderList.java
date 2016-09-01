/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode p = head;
        ListNode q = head;
        while (p.next != null && p.next.next != null) {
            p = p.next.next;
            q = q.next;
        }
        ListNode headtwo = q.next;
        q.next = null;
        headtwo = reverse(headtwo);
        p = head; q = headtwo;
        while (q != null) {
            ListNode next1 = p.next;
            ListNode next2 = q.next;
            p.next = q;
            q.next = next1;
            p = next1;
            q = next2;
        }
    }
    
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
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
}