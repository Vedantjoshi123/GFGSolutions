//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str =
                (br.readLine()).trim().split(" "); // Reading input as a string array
            int arr[] = new int[str.length]; // Creating integer array from the input
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            // Getting the result from the Solution class
            List<Integer> result = new Solution().frequencyCount(arr);

            // Printing the result in the required format
            if (result.isEmpty()) {
                System.out.println("[]");
            } else {
                for (int i = 0; i < result.size(); i++) {
                    if (i != 0) System.out.print(" ");
                    System.out.print(result.get(i));
                }
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


class Solution {
    
    public List<Integer> frequencyCount(int[] arr) {
        List<Integer> freq = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            freq.add(0);
        }
        for(int i=0; i<arr.length; i++){
            freq.set(arr[i]-1, freq.get(arr[i]-1)+1);
        }
        return freq;
    }

    
    // Working But Time limit exceed --> Complexity O(n2)
    // public List<Integer> frequencyCount(int[] arr) {
    //     List<Integer> freq = new ArrayList<>();
    //     for(int i=1; i<=arr.length; i++){
    //         int count = 0;
    //         for(int j=0; j<arr.length; j++){
    //             if(i == arr[j]){
    //                 count++;
    //             }
    //         }
    //         freq.add(count);
    //     }
    //     return freq;
    // }
}
