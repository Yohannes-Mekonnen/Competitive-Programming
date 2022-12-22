import java.util.*;

class Solution {
    public int maxCoins(int[] piles) {
        int left = 0;
        int right = piles.length-1;
        Arrays.sort(piles);
        int sum = 0;
        while(right > left) {
            int alice = piles[right];
            right--;
            int me = piles[right];
            right--;
            int bob = piles[left];
            left++;

            sum+=me;
        }

        return sum;
    }
}
