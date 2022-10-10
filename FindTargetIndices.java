import java.util.*;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> indices = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if(nums[j] > nums[i]) {
                int swap=nums[i];
                nums[i] = nums[j];
                nums[j] = swap;
                }
                
            }
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                indices.add(i);
            }
        }
        return indices;
    }
}
