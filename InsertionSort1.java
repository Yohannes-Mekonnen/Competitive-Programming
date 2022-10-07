import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class InsertionSort1 {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
    // Write your code here
int lastIndex = arr.size()-1;
        int lastValue = arr.get(lastIndex);
        
        for(int i=lastIndex; i>0; i--) {
            if(arr.get(i-1) > lastValue) {
                arr.set(i, arr.get(i-1));
                
                System.out.println(arr.toString().replace("[", "").replace("]", "").replace(",", ""));
            } else if (arr.get(i-1) < lastValue) {
                arr.set(i, lastValue);
                break;
            }
        }
        
            
        if (arr.get(0) > lastValue) {
            arr.set(0, lastValue);
        }
        System.out.println(arr.toString().replace("[", "").replace("]", "").replace(",", ""));
        
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.insertionSort1(n, arr);

        bufferedReader.close();
    }
}
