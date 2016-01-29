/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//1.Connect the a list's end node to its start node
//If there is an intersection, it will form a loop

//2.Use Floyd’s Cycle Detection Algorithm to dectect loop

//3.Once we found a loop is present.
//Move the slowPointer to start of the list,(i.e headNode) 
//and let fastPointer remain there at the meeting point(Floyd’s Cycle Detection Algorithm)
//Now move both the pointers one node at a time(Yes! You heard it right. Now even fastPointer moves at one node at a time)
//The point where both pointers will meet, is our required start of the loop.
//Proof: http://learningarsenal.info/index.php/2015/08/24/detecting-start-of-a-loop-in-singly-linked-list/

//4.Another thing: How does java default compare two self-defined objects?
//Returns true if and only if x and y refer to the same object (x == y has the value true).
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        if (headA == null || headB == null) return null;
        // find last node of list A (c3)
        ListNode endA = headA;
        while (endA.next != null) {
            endA = endA.next;
        }
        // join c3 to b1 making a c1...c3-b1...b3-c1 loop (if b3 indeed points to c1)
        endA.next = headB;
    
        ListNode start = null; // if there's no cycle this will stay null
        // Floyd's cycle finder
        ListNode slow = headA, fast = headA;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { // found a cycle
                // reset to beginning to find cycle start point (c1)
                start = headA;
                // since loop exist, slow will definitely meet start at "intersection"
                while (slow != start) {
                    slow = slow.next;
                    start = start.next;
                }
                break;
            }
        }
        // unjoin c3-b1!! As is required by author
        endA.next = null;
        return start;
    }
}




//Floyd’s Cycle Detection Algorithm: detect a cycle in a list
//if: slower car(double speed) meet faster car->find a cycle
//else: faster car reach null->no cycle

// public class FindLoop {

//     public static void isLoopPresent(ListNode nodeHead){

//     ListNode slowPointer,fastPointer;
//              slowPointer = nodeHead;
//              fastPointer = nodeHead;
    
//     //we will be using a flag to know if loop was found
//     boolean loopFound = false;

//     while(fastPointer != null){

//         fastPointer = fastPointer.next;

//         if(fastPointer != null){
//             fastPointer = fastPointer.next;
//             slowPointer = slowPointer.next;
//         }


//         if(fastPointer == slowPointer){
//             loopFound = true;
//             // we need to break otherwise it will go on forever
//             break; 
//         }
//     }

//     if(loopFound){
//         System.out.println("Loop is Present");
//     }else{
//         System.out.println("No Loop Found");
//     }

//   }

//     public static void main(String [] args){

//         /*
//         Creating a Linked List of eight nodes
//         having a loop at (node 3)

//         HEAD-->1-->2-->3-->4-->5
//                       ^       |
//                       |       v
//                       8<--7<--6

//         */

//         // creating 8 independent nodes
//         ListNode nodeOne = new ListNode(1);
//         ListNode nodeTwo = new ListNode(2);
//         ListNode nodeThree = new ListNode(3);
//         ListNode nodeFour = new ListNode(4);
//         ListNode nodeFive = new ListNode(5);
//         ListNode nodeSix = new ListNode(6);
//         ListNode nodeSeven = new ListNode(7);
//         ListNode nodeEight = new ListNode(8);

//         //Head node pointing to first node of linked list
//         ListNode nodeHead = nodeOne;

//         // creating a dependency in nodes by linking node to one another
//         nodeOne.next = nodeTwo;
//         nodeTwo.next = nodeThree;
//         nodeThree.next = nodeFour;
//         nodeFour.next = nodeFive;
//         nodeFive.next = nodeSix;
//         nodeSix.next = nodeSeven;
//         nodeSeven.next = nodeEight;
//         nodeEight.next = nodeThree; // this line creates the loop

//         //calling method to evaluate
//         isLoopPresent(nodeHead);

//     }
// }