import java.util.*;
class Solution {
    public String sortSentence(String s) {
        String[] exploded = s.split(" ");
        HashMap<Integer, String> orderHS = new HashMap<>();
        
        for(int i=0; i<exploded.length; i++) {
            if(!s.isEmpty()) {
                int lastIndex = exploded[i].length() - 1;
                int wordId = Integer.parseInt(exploded[i].substring(lastIndex));
                String trimmed = exploded[i].substring(0, lastIndex);
                orderHS.put(wordId, trimmed);
            }
        }
                          
        int count = exploded.length;
        String fixed = "";
        for(int i=1; i<=count; i++) {
            fixed += orderHS.get(i) + " ";
        }
        return fixed.trim();
    }
}
