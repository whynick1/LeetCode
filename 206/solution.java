
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//fail to solve this problem by myself, hard to understand, try to draw a picture
//recursion method will reverse the link front back to front

//it first go to the end of list to find the new 'head'
//then, it recursively reverse to pointer from back to front
//critical thingking: if it reverse from front to back, like iteration method do
//then it will forget the next node, thus never reach the end
/*public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next == null)
            return head;
     
        //get second node    
        ListNode second = head.next;
        //set first's next to be null
        head.next = null;
     
        ListNode rest = reverseList(second);
        second.next = head;
     
        return rest;
    }
}

*/
//however, iteration method will reverse the link from front to back
//from front to end will bring a problem that next node may forget its pre node
//To solve it, we always use a 'pre' and a 'next' node to point to remember the front and back node
/*public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next == null) 
            return head;
     
        ListNode pre = head;
        ListNode current = head.next;
     
        head.next = null;
        while(pre!= null && current!= null){
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            if (next!=null){
                current = next;
            }else{
                break;
            }
        }
        return current;
    }
}*/


public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next == null) 
            return head;
        ListNode pre = head;
        ListNode current = head.next;
        ListNode next = current.next;
        
        //don't forgot head.next = null
        head.next = null;
        while (current != null)
        {
            next = current.next;
            current.next = pre;
            pre = current;
            
            //without if-else, just use 'current = next', it will finally 
            //return null as the 'new head', which is absolutely wrong
            if (next != null){
                current = next;
            }
            else
                break;
        }
        return current;
    }
}

