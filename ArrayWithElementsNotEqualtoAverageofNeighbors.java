class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int first = nums[0];
        int right = n-1;
        int left = 0;
        Arrays.sort(nums);
        ArrayList<Integer> shuffled = new ArrayList<>();
        while(n != shuffled.size()) {
            shuffled.add(nums[left]);
            left++;

            if(left <= right) {
                shuffled.add(nums[right]);
                right--;
            } 
        }

        int[] result = new int[n];

        for(int i=0; i<n; i++) {
            result[i] = shuffled.get(i);
        }
        return result;
    }
}
