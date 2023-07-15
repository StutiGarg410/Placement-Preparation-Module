class MyQueue {
    
    Stack<Integer> mainS;
    Stack<Integer> helperS;

    public MyQueue() {
        mainS = new Stack<>();
        helperS = new Stack<>();
    }
    
    public void push(int x) {
        mainS.push(x);
    }
    
    public int pop() {
        while(mainS.size()>1){
            helperS.push(mainS.pop());
        }
        int val = mainS.pop();
        while(helperS.size()>0){
            mainS.push(helperS.pop());
        }
        return val;
    }
    
    public int peek() {
        while(mainS.size()>1){
            helperS.push(mainS.pop());
        }
        int val = mainS.pop();
        helperS.push(val);
        while(helperS.size()>0){
            mainS.push(helperS.pop());
        }
        return val;
    }
    
    public boolean empty() {
        return mainS.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */