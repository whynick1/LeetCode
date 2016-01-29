//fail to solve because time exceeded
//the problem is push to the back is much slower than push to front
//cause if push to front, don't need to traversal the node list
//use a min in class Node is very smart, by seting each node's min when created, it eliminate comparision for getMin() 
class MinStack {
    private Node head;

    private class Node {
        int val;
        int min;
        Node next;

        private Node(int val, int min) {
            this(val, min, null);
        }

        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
    public void push(int x) {
        if(head == null) 
            head = new Node(x, x);
        else 
            head = new Node(x, Math.min(x, head.min), head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
}

// class MinStack {
//     private Node head;
//     class Node
//     {
//         int val;
//         int min;
//         Node next;
//         Node(int val, int min)
//         {
//             this.val = val;
//             this.min = min;
//             this.next = null;
//         }
//     }
    
//     public void push(int x) {
//         if (head == null)
//         {
//             head = new Node(x, x);
//         }
//         else
//         {
//             Node front = head;
//             while (front.next != null)
//             {
//                 front = front.next;
//             }
//             front.next = new Node(x, Math.min(front.val, x));
//         }
//     }

//     public void pop() {
//         Node front = head;
//         if (front == null)
//             return;
//         if (front.next == null)
//             head = null;
//         else
//         {
//             Node pre = front;
//             front = pre.next;
//             while (front.next != null)
//             {
//                 pre = pre.next;
//                 front = pre.next;
//             }
//             pre.next = null;
//         }
//     }

//     public int top() {
//         Node front = head;
//         if (front == null)
//             return 0;
//         while (front.next != null)
//         {
//             front = front.next;
//         }
//         return front.val;
//     }

//     public int getMin() {
//         Node front = head;
//         if (front == null)
//             return 0;
//         while (front.next != null)
//         {
//             front = front.next;
//         }
//         return front.min;
//     }
// }
