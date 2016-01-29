
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    //fail to solve the problem
    //This is very basic and important!
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //only one statement is enough to solve 3 condition
        //cause linklist is connected, I don't need to insert rest of the node anymore
        if(l1==null||l2==null) return l1==null?l2:l1;
        //the head node is specil, need seperate initiate.
        ListNode head = null;
        if(l1.val<=l2.val) {
            head=l1;
            l1=l1.next;
        }
        else {
            head=l2;
            l2=l2.next;
        }
        ListNode temp = head;
        //in while loop, temp.next = smallvalue; l1 = l1.next; temp = temp.next;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val) {
                temp.next=l1;
                l1=l1.next;
            }
            else {
                temp.next=l2;
                l2=l2.next;
            };
            temp=temp.next;
        }
        //finally, we find the non-null node add it to the rear of l3
        //cause linklist is connected, I don't need to insert rest of the node anymore
        temp.next=l1==null?l2:l1;
        return head;
    }
}   
        
        
        
        
        
        
        
        
        
        