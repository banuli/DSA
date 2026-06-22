class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int value) {
        
        stack.push(value);
        if(minStack.isEmpty() || minStack.peek() >= value){
            minStack.push(value);
        }
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            if(!minStack.isEmpty() && minStack.peek().equals(stack.peek())){
                minStack.pop();
            }
            stack.pop();
        }
    }
    
    public int top() {
        if (!stack.isEmpty()){
            return stack.peek();
        }
        return 0;
    }
    
    public int getMin() {
        if(!minStack.isEmpty()){
            return minStack.peek();    
        }
        return 0;   
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */