import java.util.*;

class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        int output = 0;
        HashMap<Integer, Integer> counts = new HashMap<>();

        for(int i=0; i<n; i++) {
            if(counts.containsKey(arr[i])) {
                counts.put(arr[i], counts.get(arr[i]) + 1);
            } else {
                counts.put(arr[i], 1);
            }
        }

        int[] countsArray = new int[counts.size()];
        int c = 0;
        for(Map.Entry<Integer, Integer> s: counts.entrySet()) {
            countsArray[c] = s.getValue();
            c++;
        }

        Arrays.sort(countsArray);

        int sum = 0;
        int sumCount = 0;
        for(int i = countsArray.length - 1; i>=0; i--) {
            sum += countsArray[i];
            if(sum >= n/2) {
                sumCount++;
                break;
            } else {
                sumCount++;
            }
        }

        return sumCount;
    }
}
