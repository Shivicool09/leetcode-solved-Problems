class MyStack {
    Queue<Integer> stack;
    Queue<Integer> temp;

    public MyStack() {
        stack=new LinkedList<>();
        temp=new LinkedList<>();
        
    }
    
    public void push(int x) {
        if(stack.size()==0){
            stack.add(x);
            return;
        }
        while(!stack.isEmpty()){
            temp.add(stack.poll());
        }
        stack.add(x);
        while(!temp.isEmpty()){
            stack.add(temp.poll());
        }
        
    }
    
    public int pop() {
        return stack.poll();
        
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public boolean empty() {
        return stack.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */