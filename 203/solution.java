/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//good job!
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val) head = head.next;
        if (head == null)
            return null;
        ListNode front = head;
        ListNode current = head.next;
        while (head.val == val)
        {
            if (head.next != null)
                head = head.next;
            else
                return null;
        }
        while (front.next != null)
        {
            if (current.val == val)
            {
                front.next = current.next;
                current = current.next;
            }
            else
            {
                front = current;
                current = current.next;
            }
        }
        return head;
    }
}