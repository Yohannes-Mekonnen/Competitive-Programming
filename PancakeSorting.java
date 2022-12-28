import java.util.*;

class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        int n = arr.length;
        List<Integer> result = new ArrayList<>();

        int currentSortedCount = 0;
        int currentSortedIndex = n - 1 - currentSortedCount;
        boolean sorted = false;
        int[] swap = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            swap[i] = arr[i];
        }

        while(currentSortedIndex > 0) {
            int max = 0;
            int maxIndex = 0;

            for(int i=0; i<=currentSortedIndex; i++) {
                if(arr[i] > max) {
                    max = arr[i];
                    maxIndex = i;
                }
            }

            if(maxIndex == currentSortedIndex) {
                currentSortedCount++;
                currentSortedIndex--;
            } else {
                int c = 0;
                for(int i=maxIndex; i>=0; i--) {
                    arr[c] = swap[i];
                    c++;
                }

                result.add(maxIndex + 1);

                for(int i=0; i<arr.length; i++) {
                    swap[i] = arr[i];
                }

                c = 0;
                for(int i=currentSortedIndex; i>=0; i--) {
                    arr[c] = swap[i];
                    c++;
                }
                                    
                result.add(currentSortedIndex + 1);

                for(int i=0; i<arr.length; i++) {
                    swap[i] = arr[i];
                }
                currentSortedCount++;
                currentSortedIndex--;
            }
        }

        return result;
    }
}
