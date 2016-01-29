/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//fail to solve within O(n) time and O(1) space
//The solution is really smart beating 90% by reversing the first half of the linked list
//then start from the middle to both sides
//finally, check whether the elements are the same
//the rest two difficulty are :reverse a linked list from middle & process both even and odd length Linkedlist
public class Solution {
    public boolean isPalindrome(ListNode head) {
        int length = 0;
        if (head == null || head.next == null)
            return true;
        ListNode pre = head;
        ListNode current = pre.next;
        ListNode next = current.next;
        while (pre != null)
        {
            length++;
            pre = pre.next;
        }
        pre = head;
        pre.next = null;

        int mid = length / 2 - 1;
        for (int i = 0; i < mid; i++)
        {
            current.next = pre;
            pre = current;
            current = next;
            if (next != null)
            next = next.next;
        }
        if (length % 2 == 1)
            current = current.next;
        ListNode left = pre;
        ListNode right = current;
        for (int j = 0; j < mid + 1; j++)
        {
            if (left.val == right.val)
            {
                left = left.next;
                right = right.next;
            }
            else
                return false;
        }
        return true;
    }
}

