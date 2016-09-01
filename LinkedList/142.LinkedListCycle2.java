/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        boolean move = false;
        ListNode p = head;
        ListNode q = head;
        while (p !=null && p.next !=null) {
            p = p.next.next;
            q = q.next;
            if (p == q) {
                move = true;
                break;
            }
        }
        if(!move) return null;
        p = head;
        while (p != q) {
            p = p.next;
            q = q.next;
        }
        return p;
    }
}