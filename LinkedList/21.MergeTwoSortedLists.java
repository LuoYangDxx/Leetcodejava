/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);
        l4 = l3;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                l3.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                l3.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        while (l1 != null) {
            l3.next = new ListNode(l1.val);
            l1 = l1.next;
            l3 = l3.next;
        }
        while (l2 != null) {
            l3.next = new ListNode(l2.val);
            l2 = l2.next;
            l3 = l3.next;
        }
        return l4.next;
    }
}