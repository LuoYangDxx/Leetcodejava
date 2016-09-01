/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);
        l4 = l3;
        int remainder = 0;
       while (l1 != null && l2 != null) {
          int sum = l1.val + l2.val + remainder;
          remainder = sum/10;
          int value = sum%10;
          l3.next = new ListNode(value);
          l3 = l3.next;
          l1 = l1.next;
          l2 = l2.next;
       }
       while (l1 != null) {
          int sum = l1.val + remainder;
          remainder = sum/10;
          int value = sum%10;
          l3.next = new ListNode(value);
          l3 = l3.next;
          l1 = l1.next;
       }
       while (l2 != null) {
          int sum = l2.val + remainder;
          remainder = sum/10;
          int value = sum%10;
          l3.next = new ListNode(value);
          l3 = l3.next;
          l2 = l2.next;
       }
       if (remainder != 0) l3.next = new ListNode(1);
       return l4.next;
    }
}