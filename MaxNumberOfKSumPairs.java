class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> values = new HashMap<>();
        int operation = 0;

        for(Integer i: nums) {
            if(values.containsKey(i)) {
                values.put(i, values.get(i) + 1);
            } else {
                values.put(i, 1);
            }
        }

        for(int i=0; i < nums.length; i++) {
            int x = nums[i];
            int y = k - x;
            if(x == y && values.get(y) > 1) {
                values.put(x, values.get(x) - 2);
                operation++;
            } else if(values.containsKey(y) && values.get(y) > 0 && values.get(x) > 0 && x != y) {
                values.put(y, values.get(y) - 1);
                values.put(x, values.get(x) - 1);
                operation++;
            }
        }

        return operation;
    }
}
