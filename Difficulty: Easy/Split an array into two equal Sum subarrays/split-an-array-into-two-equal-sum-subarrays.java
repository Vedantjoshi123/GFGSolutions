//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s = br.readLine().trim().split(" ");

            int[] arr = new int[s.length];
            for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(s[i]);

            Solution obj = new Solution();
            boolean res = obj.canSplit(arr);
            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution {
    public boolean canSplit(int arr[]) {
          int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        int res=sum/2;
        if(sum%2!=0)
        return false;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum-arr[i];
            if(sum==res)
            {
                return true;
            }
        }
        return false;
    }
}