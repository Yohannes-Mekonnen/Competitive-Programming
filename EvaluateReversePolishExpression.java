import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> theStack = new Stack<>();
        for(String token: tokens) {
            if(token.equals("+")) {
                int op1 = theStack.pop();
                int op2 = theStack.pop();
                int sum = op2 + op1;
                theStack.push(sum);
            } else if(token.equals("-")) {
                int op1 = theStack.pop();
                int op2 = theStack.pop();
                int difference = op2 - op1;
                theStack.push(difference);
            } else if(token.equals("*")) {
                int op1 = theStack.pop();
                int op2 = theStack.pop();
                int product = op2 * op1;
                theStack.push(product);
            } else if(token.equals("/")) {
                int op1 = theStack.pop();
                int op2 = theStack.pop();
                int quotient = op2 / op1;
                theStack.push(quotient);
            } else {
                theStack.push(Integer.parseInt(token));
            }
        }

        return theStack.pop();
    }
}
