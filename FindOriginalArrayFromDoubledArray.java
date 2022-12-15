import java.util.*;

class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        List<Integer> originalList = new ArrayList<>();

        if(n % 2 != 0) {
            return new int[0];
        }

        if(n == 1) {
            return new int[0];
        }

        if(n == 0) {
            return changed;
        }

        HashMap<Integer, Integer> countsHS = new HashMap<>();

        for(int i: changed) {
            if(countsHS.containsKey(i)) {
                countsHS.put(i, countsHS.get(i) + 1);
            } else {
                countsHS.put(i, 1);
            }
        }

        if(countsHS.containsKey(0)) {
            if(countsHS.get(0)%2 != 0) {
                return new int[0];
            } else {
                countsHS.put(0, countsHS.get(0)/2);
            }

            for(int i=0; i<countsHS.get(0); i++) {
                originalList.add(0);
            }

            countsHS.put(0, 0);
        }

        Arrays.sort(changed);

        for(Integer i: changed) {
            if(i!=0 && countsHS.containsKey(i*2) && countsHS.get(i) > 0 && countsHS.get(i*2) > 0) {
                countsHS.put(i, countsHS.get(i) - 1);
                countsHS.put(i*2, countsHS.get(i*2) -1);
                originalList.add(i);
            }
        }

        for(Map.Entry<Integer, Integer> es: countsHS.entrySet()) {
            if(es.getValue() != 0) {
                return new int[0];
            }
        }

        int[] originalResult = new int[originalList.size()];

        for(int i=0; i<originalResult.length; i++) {
            originalResult[i] = originalList.get(i);
        }

        return originalResult;
    }
}
