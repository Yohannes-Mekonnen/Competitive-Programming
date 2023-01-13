import java.util.*;

class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stackA = new Stack<>();
        Stack<Character> stackB = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ')') {
                while(stackA.lastElement() != '(') {
                    stackB.push(stackA.pop());
                }
                stackA.pop();
                
                for(Character c: stackB) {
                    stackA.push(c);
                }

                stackB = new Stack<>();
            } else {
                stackA.push(s.charAt(i));
            }
        }

        String result = "";

        for(Character c: stackA) {
            result += c;
        }

        return result;
    }
}
