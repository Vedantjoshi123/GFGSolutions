//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; ++i) arr[i] = sc.nextInt();

            System.out.println(new Sol().search(n, arr));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Sol {
    public static int search(int n, int arr[]) {
         int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (arr[mid] == arr[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }

        return arr[left];
        
        
        
        
        
        //   for (int i = 0; i < arr.length; i++) {
        //     int count = 0;
        //     for (int j = 0; j < arr.length; j++) {
        //         if (arr[i] == arr[j]) {
        //             count++;
        //         }
        //     }
        //     if (count == 1) {
        //         return arr[i];
        //     }
        // }
        // return -1;
        
        
    //   for(int i=0; i<n; i++){
    //       for(int j=i+1; j<n; j++){
    //           if(arr[i] == arr[j]){
    //               arr[i] = -1;
    //               arr[j] = -1;
    //           }
    //       }
    //   }
    //   for(int i=0; i<n; i++){
    //       if(arr[i] != -1){
    //           return arr[i];
    //       }
    //   }
    //   return -1;
    }
    
}