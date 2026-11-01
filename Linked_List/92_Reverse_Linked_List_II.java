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
    public ListNode toadd(ListNode head, ListNode value) {
        value.next = head;
        return value;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = null;
        int count = 1;
        ListNode temp1 = head;
        ListNode leftmostNode = head;
        while (count != left) {
            leftmostNode = temp1;
            temp1 = temp1.next;
            count++;
        }
        ListNode last = temp1;
        ListNode rightestNode = null;
        while (count <= right) {
            ListNode next = temp1.next;
            rightestNode = next;
            temp = toadd(temp, temp1);
            temp1 = next;
            count++;
        }
        last.next = rightestNode;
        if (left != 1) leftmostNode.next = temp;
        return left == 1 ? temp : head;
    }
}
