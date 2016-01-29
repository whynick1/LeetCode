/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void deleteNode(ListNode node) 
    {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

// Mention: I can not use: node = node.next; to substitue the last two statements, 
// because if node.next = node.next.next execute before node.val =node.next.val, 
// then the node.next has been changed, unable to get right node.next.val.

