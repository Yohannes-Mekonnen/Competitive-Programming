import java.util.*;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        if(nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int maxFrequency = 1;
        for(int i = nums.length-1; i>=1; i--) {
            int counter = 1;
            int operation = k;
            int currentNumber = nums[i];
            int j = i-1;     
            while(j>=0 && currentNumber - nums[j] <= operation) {
                if(nums[i] == nums[j] && i>0) {
                    counter++;
                    i--;
                    j=i-1;
                } else {
                    operation -= currentNumber - nums[j];
                    counter++;
                    j--;
                }

                if(counter > maxFrequency) {
                    maxFrequency = counter;
                }
            }
        }

        return maxFrequency;
    }
}
