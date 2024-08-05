//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        StringBuilder sb = new StringBuilder();
        for (int e : a) sb.append(e + " ");
        System.out.println(sb);
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str[] = br.readLine().trim().split(" ");

            int n = Integer.parseInt(str[0]);
            int s = Integer.parseInt(str[1]);

            int[] arr = IntArray.input(br, n);

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(arr, n, s);

            IntArray.print(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
  int sum=0,i=0,j=0,flag=0;
        ArrayList<Integer> a=new ArrayList<>(2);
        if(s==0){
            for(i=0;i<n;i++){
                if(arr[i]==0){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                a.add(i+1);
                a.add(i+1);
            }
        }
        else{
            while (i<n || j<n){
                if ( sum<s && j==n )
                break;
                if (sum<s){
                    sum+=arr[j++];
                }
                else if(sum>s){
                    sum-=arr[i++];
                }
                if(sum==s){
                    a.add(i+1);
                    a.add(j);
                    break;
                }
            }
        }
        if (a.isEmpty())
        a.add(-1);
        return a;
    }
}
