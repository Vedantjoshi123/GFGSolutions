//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String str = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.countMin(str));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int countMin(String str)
    {
        // int s = 0;
        // int e = str.length() - 1;
        // int count = 0;

        // while (s < e) {
        //     if (str.charAt(s) != str.charAt(e)) {
        //         count++;
        //         // Attempt to match by skipping the end character first
        //         if (str.charAt(s) == str.charAt(e-1)) {
        //             e--;
        //         } 
        //         // Otherwise, skip the start character
        //         else if (str.charAt(s + 1) == str.charAt(e)) {
        //             s++;
        //         } 
        //         // If neither match, increment start and decrement end
        //         else {
        //             s++;
        //             e--;
        //         }
        //     } else {
        //         s++;
        //         e--;
        //     }
        // }

        // return count;
        
        
                int n = str.length();
        int[][] dp = new int[n][n];

        for (int gap = 1; gap < n; gap++) {
            for (int l = 0, h = gap; h < n; l++, h++) {
                if (str.charAt(l) == str.charAt(h)) {
                    dp[l][h] = dp[l + 1][h - 1];
                } else {
                    dp[l][h] = Math.min(dp[l][h - 1], dp[l + 1][h]) + 1;
                }
            }
        }

        return dp[0][n - 1];
    }
}