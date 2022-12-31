import java.util.*;

class MinStack {
    Stack<Integer> theStack = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        this.theStack.push(val);
    }
    
    public void pop() {
        this.theStack.pop();
    }
    
    public int top() {
        return this.theStack.lastElement();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(Integer i: this.theStack) {
            if(i < min) {
                min = i;
            }
        }
        return min;
    }
}
