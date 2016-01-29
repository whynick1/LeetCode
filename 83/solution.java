/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;
        ListNode currentNode = head.next;
        ListNode lastNode = head;
        while (currentNode != null)
        {
            if (currentNode.val == lastNode.val)
            {
                lastNode.next = currentNode.next;
                currentNode = currentNode.next;
            }
            else
            {
                lastNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}

//always keep in mind: try to use as fewer pointer as possible!
//my idea is like: this value is the same as last one, skip this one;
//answer solution is like: next value is the same as this one, skip next one;
//therefore, the node: lastNode pointer could be omitted, which is absolutely easier
/*public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tmp = head;
        while(tmp != null) {
            if(tmp.next != null && tmp.next.val == tmp.val)
                tmp.next = tmp.next.next;
            else
                tmp = tmp.next;
        }
        return head;
    }
}*/