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
    public ListNode Del(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp = null;
        return head;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        ListNode temp = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode ptr = head;
        ListNode ptr1 = slow.next;
        if (ptr == slow) {
            if (ptr.next == null) {
                head = null;
                return head;
            } else {
                head=Del(head);
                return head;
            }
        }
        while (ptr.next != slow) {
            ptr = ptr.next;
        }
        ptr.next = ptr1;
        ListNode to_delete = ptr.next;
        to_delete = null;
        return head;
    }
};
