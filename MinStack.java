class MinStack {
    long minEle;
    Stack<Long> stack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack();
    }
    
    public void push(int x) {
        if(stack.isEmpty()){
            stack.push((long)0);
            minEle = x;
        }
        else{
            stack.push(x-minEle);
            if(x<minEle){
                minEle = x;
            }
        }
    }
    
    public void pop() {
        long x = stack.pop();
        if(x<0){
            minEle = minEle-x;
        }
    }
    
    public int top() {
        long x = stack.peek();
        if(x<0){
            return (int)minEle;
        }
        else{
            return (int)(x+minEle);
        }
    }
    
    public int getMin() {
        if(!stack.isEmpty()){
            return (int)(minEle);
        }
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
