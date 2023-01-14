import java.util.*;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] f = new int[26]; 
        int max = 0; 
        int maxf = 0; 

        // create frequency of tasks 
        for(char task : tasks) { 
           f[task-'A']++;

           if(f[task-'A'] > max) { // get the task with max frequency 
              max = f[task-'A'];
              maxf = 1;
           } else if(f[task-'A'] == max) { // if there is more than one task with max frequency  
               maxf++;
            } 
         } 

         int intervals = (max - 1) * (n + 1) + maxf; 

         return Math.max(intervals, tasks.length); 
    }
}
