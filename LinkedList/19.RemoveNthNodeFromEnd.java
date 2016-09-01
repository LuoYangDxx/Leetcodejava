/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prehead = new ListNode(0);
        prehead.next = head;
        ListNode first = prehead;
        ListNode second = prehead;
        
        while (n > 0) {
            first = first.next;
            n--;
        }
        if (first.next == null) return head.next;
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return head;
    }
}