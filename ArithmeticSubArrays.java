import java.util.*;

class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int n = l.length;
        List<Boolean> result = new ArrayList<>();
        for(int i = 0; i<n; i++) {
            int innerLength = r[i] - l[i] + 1;

            int[] swap = new int[innerLength];
            int counter = 0;
            for(int j=l[i]; j<=r[i]; j++) {
                swap[counter] = nums[j];
                counter++;
            }

            Arrays.sort(swap);
            int previousValue = swap[1] - swap[0];
            boolean success = false;
            for(int k=0; k<swap.length-1; k++) {
                int currentValue = swap[k+1] - swap[k];
                if(currentValue == previousValue) {
                    success = true;
                    previousValue = currentValue;
                } else {
                    success = false;
                    break;
                }
            }

            if(!success) {
                previousValue = swap[swap.length-2] - swap[swap.length - 1];
                for(int k=swap.length-1; k>0; k--) {
                    int currentValue = swap[k-1] - swap[k];

                    if(currentValue == previousValue) {
                        success = true;
                        previousValue = currentValue;
                    } else {
                        success = false;
                        break;
                    }
                }
            }

            result.add(success);
        }
        return result;
    }
}
