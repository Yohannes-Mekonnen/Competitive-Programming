import java.util.*;

class Solution {

    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int pairs[][] = new int[n/2][2];

        int left = 0;
        int right = n-1;

        int i = 0;
        while(right > left) {
            pairs[i][0] = nums[left];
            pairs[i][1] = nums[right];
            left++;
            right--;
            i++;
        }

        int max = 0;
        for(int j=0; j<n/2; j++) {
            int sum = pairs[j][0] + pairs[j][1];
            if(max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
