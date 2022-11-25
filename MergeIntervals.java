import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        
        int n = intervals.length;
        if(n == 1) {
            return intervals;
        }

        int initials[] = new int[n];
        int terminals[] = new int[n];

        for(int i=0; i<n; i++) {
            initials[i] = intervals[i][0];
            terminals[i] = intervals[i][1];
        }

        Arrays.sort(initials);
        Arrays.sort(terminals);

        int initial = initials[0];
        HashMap<Integer, Integer> values = new HashMap<>();
        for(int i=1; i<n; i++) {
            
            if(initials[i] > terminals[i-1] && initial != initials[i]) {
                values.put(initial, terminals[i-1]);
                initial = initials[i];
            } 

            if(i == n-1 && initial == initials[i]) {
                values.put(initials[i], terminals[i]);
            } else {
                values.put(initial, terminals[i]);
            }
        }

        int[][] result = new int[values.size()][2];

        int counter = 0;
        for(Map.Entry<Integer, Integer> l : values.entrySet()) {
            System.out.println(l.getKey() + " - " + l.getValue());
            result[counter][0] = l.getKey();
            result[counter][1] = l.getValue();
            counter++;
        }
        
        return result;
    }
}
