import java.util.*;

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        int[] distances = new int[n];
        int[][] result = new int[k][2];

        for(int i=0; i<n; i++) {
            int x=points[i][0]; 
            int y=points[i][1];


            distances[i] = (x * x) + (y * y);
        }

        Arrays.sort(distances);

        int lastDistance = distances[k-1];
        int counter = 0;
        for(int i=0; i<n; i++) {
            int x=points[i][0]; 
            int y=points[i][1];


            int currentSum = (x * x) + (y * y);
            if(currentSum <= lastDistance) {
                result[counter] = points[i];
                counter++;
            }
        }
        return result;
    }
}
