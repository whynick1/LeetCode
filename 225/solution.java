//good job!
class MyStack {
    public Queue<Integer> q1 = new LinkedList<Integer>();
    public Queue<Integer> q2 = new LinkedList<Integer>();
    
    // Push element x onto stack.
    public void push(int x) {
        q1.offer(x);
        int size = q1.size();
        while(size-- > 1)
        {
            q2.offer(q1.poll());
            q1.offer(q2.poll());
        }    
    }

    // Removes the element on top of the stack.
    public void pop() {
        q1.poll();
    }

    // Get the top element.
    public int top() {
        return q1.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty();
    }
}