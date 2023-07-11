import java.util.Stack;

class MyQueue {

    private Stack<Integer> s1; // Main stack for enqueueing elements
    private Stack<Integer> s2; // Auxiliary stack for dequeueing elements
    
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public boolean isEmpty() {
        return s1.isEmpty();
    }
    
    public void push(int x) {
        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        
        // Push the new element to s1
        s1.push(x);
        
        // Move all elements back from s2 to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }
    
    // Removes the element from the front of the queue and returns it
    public int pop() {
        if (isEmpty()) {
            return -1; // If the queue is empty, return -1 or throw an exception
        }
        return s1.pop();
    }
    
    // Returns the element at the front of the queue
    public int peek() {
        if (isEmpty()) {
            return -1; // If the queue is empty, return -1 or throw an exception
        }
        return s1.peek();
    }
    
    // Returns true if the queue is empty, false otherwise
    public boolean empty() {
        return s1.isEmpty();
    }
}

