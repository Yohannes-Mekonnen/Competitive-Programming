import java.util.*;
import java.math.*;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        int n = nums.length;

        ArrayList<BigInteger> values = new ArrayList<>();

        for(String num: nums) {
            values.add(new BigInteger(num));
        }

        Collections.sort(values);
        
        String largestInteger = values.get(n-k).toString();

        return largestInteger;
    }
}
