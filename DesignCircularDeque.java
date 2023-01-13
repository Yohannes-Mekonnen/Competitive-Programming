import java.util.*;

class MyCircularDeque {
    Deque<Integer> theDeque = null;
    int max = 0;
    public MyCircularDeque(int k) {
        this.theDeque = new ArrayDeque<Integer>();
        this.max = k;
    }
    
    public boolean insertFront(int value) {
        boolean inserted = true;
        if(this.theDeque.size() < this.max) {
            this.theDeque.offerFirst(value);
        } else {
            inserted = false;
        }
        return inserted;
    }
    
    public boolean insertLast(int value) {
        boolean inserted = true;
        if(this.theDeque.size() < this.max) {
            this.theDeque.offerLast(value);
        } else {
            inserted = false;
        }
         return inserted;
    }
    
    public boolean deleteFront() {
        if(this.theDeque.size() > 0) {
            this.theDeque.remove();
            return true;
        } else {
            return false;
        }
    }
    
    public boolean deleteLast() {
        if(this.theDeque.size() > 0) {
            this.theDeque.removeLast();
            return true;
        } else {
            return false;
        }
    }
    
    public int getFront() {
        if(this.theDeque.size() > 0) {
            return this.theDeque.peekFirst();
        } else {
            return -1;
        }
    }
    
    public int getRear() {
        if(this.theDeque.size() > 0) {
            return this.theDeque.peekLast();
        } else {
            return -1;
        }
    }
    
    public boolean isEmpty() {
        return this.theDeque.size() == 0;
    }
    
    public boolean isFull() {
        return this.theDeque.size() == this.max;
    }
}
