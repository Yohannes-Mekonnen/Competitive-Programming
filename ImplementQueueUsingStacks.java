import java.util.*;

class MyQueue {
    private Stack<Integer> theStack = new Stack<>();
    private Stack<Integer> swap = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        this.swap = new Stack<Integer>();

        this.theStack.push(x);
        while(!this.theStack.isEmpty()) {
            this.swap.push(this.theStack.pop());
        }

        while(!this.swap.isEmpty()) {
            this.theStack.push(this.swap.pop());
        }

        for(Integer i: this.theStack) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
    
    public int pop() {
        this.swap = new Stack<>();
        int item = 0;
        while(this.theStack.size() > 1) {
            this.swap.push(this.theStack.pop());
        }

        item = this.theStack.pop();

        while(!this.swap.isEmpty()) {
            this.theStack.push(this.swap.pop());
        }
        return item;
    }
    
    public int peek() {
        int item = 0;
        this.swap = new Stack<>();
        while(!this.theStack.isEmpty()) {
            item = this.theStack.pop();
            this.swap.push(item);
        }

        while(!this.swap.isEmpty()) {
            this.theStack.push(this.swap.pop());
        }
        return item;
    }
    
    public boolean empty() {
        return this.theStack.isEmpty();
    }
}
