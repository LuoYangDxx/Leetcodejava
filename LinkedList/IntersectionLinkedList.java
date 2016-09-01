/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        int lenA = 0;
        int lenB = 0;
        while (p != null) {
            lenA++;
            p = p.next;
        }
        while (q != null) {
            lenB++;
            q = q.next;
        }
        boolean aIsLonger = false;
        if (lenA > lenB) aIsLonger = true;
        if (aIsLonger) {
            int len = lenA - lenB;
           while (len > 0) {
               headA = headA.next;
               len--;
           } 
        } else {
            int len = lenB - lenA;
            while (len > 0) {
               headB = headB.next;
               len--;
           } 
        }
        while (headA != null && headB != null) {
            if (headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}