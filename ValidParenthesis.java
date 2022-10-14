import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> openings = new HashMap<>();
        
        openings.put('{', '}');
        openings.put('(', ')');
        openings.put('[', ']');
        
        for(int i=0; i<s.length(); i++) {
            if(openings.containsKey(s.charAt(i))) {
                st.push(openings.get(s.charAt(i)));
            } else if (st.isEmpty()) {
                return false; 
            } else if(st.pop() != s.charAt(i)) {
                return false; 
            } 
        }
        
        return st.isEmpty();
    }
}
