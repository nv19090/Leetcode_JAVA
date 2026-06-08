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
    public ListNode insert(ListNode dummy, ListNode node) {
        dummy.next = node;
        node.next = null;
        return node;
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null||head.next.next==null)
            return head;
        ListNode dummy = head;
        int count = 1;
        while (dummy.next != null) {
            dummy = dummy.next;
            count++;
        }
        ListNode prev = head;
        ListNode next = head.next;
        int op = count / 2;
        while (op-- > 0 && next != null) {
            prev.next = next.next;
            ListNode nextEven = null;

            if (prev.next != null)
                nextEven = prev.next.next;

            dummy = insert(dummy, next);

            next = nextEven;
            prev = prev.next;
        }
        return head;
    }
}
