//fail to solve the problem, because use flags for each of node take O(n) space
//instead of using flags, it can make all the node you visited links to the head ListNode. 
//once you reach a new ListNode, see whether its next point is the head,
//if it is, means the node you've already visited,which means the link has a cycle.
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
    public boolean hasCycle(ListNode head) {
        ListNode p = head,pre = head;
        while(p != null && p.next != null){
            if (p.next == head) return true;
            p = p.next;
            pre.next = head;
            pre = p;
        }
        return false;
    }
}
