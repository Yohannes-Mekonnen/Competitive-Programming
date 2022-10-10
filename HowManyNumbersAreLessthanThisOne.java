class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] amount = new int[nums.length];
        int currentIndex = 0;
        for(int i=0; i<nums.length; i++) {
            int counter = 0;
            for(int j=0; j<nums.length; j++) {
                if(nums[j] < nums[i] && i!=j) {
                    counter++;
                }
            }
            amount[currentIndex] = counter;
            currentIndex++;
        }
        return amount;
    }
}
