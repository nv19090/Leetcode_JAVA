/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; } 
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode result(ListNode l3, int sum) {
        ListNode newNode = new ListNode(sum);
        if (l3 == null) {
            return newNode;
        }
        newNode.next = l3;
        l3 = newNode;
        return l3;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        int carry = 0;
        int sum = 0;

        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val+carry;
            carry = sum / 10;
            sum = sum % 10;
            l3 = result(l3, sum);
            
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l2 != null) {
            sum = l2.val + carry;

            carry = sum / 10;
            sum = sum % 10;

            l3 = result(l3, sum);
            l2 = l2.next;
        }
        while (l1 != null) {
            sum = l1.val + carry;

            carry = sum / 10;
            sum = sum % 10;

            l3 = result(l3, sum);
            l1 = l1.next;
        }
        if (carry > 0) {
            l3 = result(l3, carry);
        }
        l3 = reverse(l3);
        return l3;
    }
}
