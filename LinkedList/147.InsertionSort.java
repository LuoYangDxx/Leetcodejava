/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prehead = new ListNode(0);
        
        while (head != null) {
            ListNode pre = prehead;
            while (pre.next != null && pre.next.val < head.val) {
                pre = pre.next;
            }
            ListNode next = head.next;
            head.next = pre.next;
            pre.next = head;
            head = next;
        }
        return prehead.next;
    }
}