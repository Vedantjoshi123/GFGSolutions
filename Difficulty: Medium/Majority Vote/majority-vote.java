//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            List<Integer> nums = new ArrayList<>();
            for (String part : parts) {
                nums.add(Integer.parseInt(part));
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// } Driver Code Ends


class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0; i<nums.size(); i++){
            if(map.containsKey(nums.get(i))){
                map.put(nums.get(i), map.get(nums.get(i)) + 1);
            }
            else{
                map.put(nums.get(i), 1);
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            if(m.getValue() > (nums.size()/3)){
                ans.add(m.getKey());
            }
        }
        if(ans.isEmpty()){
            ans.add(-1);
        }
        return ans;
    }
}
