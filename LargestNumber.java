import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;

        ArrayList<String> numsList = new ArrayList<>();
        int sum = 0;

        for(Integer i: nums) {
            numsList.add(i+"");
            sum+=i;
        }

        if(sum == 0) {
            return "0";
        }

        Collections.sort(numsList, new Comparator<String> () {
            public int compare(String s1, String s2) {
                String linear = s1 + s2;
                String reverse = s2 + s1;

                return reverse.compareTo(linear) > 0 ? 1 : -1;
            }
        });

        String response = "";

        for(String i: numsList) {
            response += i;
        }

        return response;
    }
}
