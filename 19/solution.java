/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//good job!
//easy to miss some special situation like [1,2] 2
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        //remove is the pointer before the one should be removed
        ListNode remove = head;
        while (n > 0)
        {
            if (p == null)
                return p;
            p = p.next;
            n--;
        }
        if (p == null)
            return remove.next;
        while (p.next != null)
        {
           p = p.next;
           remove = remove.next;
        }
        remove.next = remove.next.next;
        return head;
    }
}