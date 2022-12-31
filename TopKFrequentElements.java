import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[k];

        HashMap<Integer, Integer> counts = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(counts.containsKey(nums[i])) {
                counts.put(nums[i], counts.get(nums[i]) + 1);
            } else {
                counts.put(nums[i], 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(counts.entrySet());

        Collections.sort(list, (hs1, hs2) -> {
            int res = 0;
            if(hs1.getValue() != hs2.getValue()) 
                res = (hs1.getValue() > hs2.getValue()) ? 1 : -1;

            return res;
        });

        for(Map.Entry<Integer, Integer> i: list) {
            System.out.println(i.getKey() + "-" + i.getValue());
        }

        int c = 0;
        for(int i=list.size() - 1; i>=0; i--) {
            result[c] = list.get(i).getKey();
            if(c == k-1) {
                break;
            }
            c++;
        }

        return result;
    }
}
