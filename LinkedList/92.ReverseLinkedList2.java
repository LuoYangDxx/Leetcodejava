/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode prehead = new ListNode(0);
        prehead.next = head;
        ListNode pointer = prehead;
        for (int i = 1; i < m; i++) {
            pointer = pointer.next;
        }
        pointer.next = reverse(pointer.next, n - m);
        return prehead.next;
    }
    public ListNode reverse(ListNode head, int n) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = null;
        for(int i = 0; i <= n; i++){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
       head.next = cur;
       return pre;
    }
}