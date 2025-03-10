//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

// User function Template for C++
class Solution {
  public:
    vector<long long> factorialNumbers(long long n) {
        long long x =1;
        long long i = 1;
        vector<long long> ans;
        while(x<=n){
            x = x*i;
            if(x<=n){
                ans.push_back(x);
                i++;
            }
        }
        return ans;
        
        // int factNum;
        // vector<long long> ans;
        // for(long long i=1; i<=n; i++){
        //     factNum = fact(i);
        //     if(factNum <= n){
        //         ans.push_back(factNum);
        //     }
        // }
        // return ans;
    }
    static int fact(int num){
        if(num==0 || num == 1){
            return 1;
        }
        return num*fact(num-1);
    }
};


//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        long long N;
        cin >> N;
        Solution ob;
        vector<long long> ans = ob.factorialNumbers(N);
        for (auto num : ans) {
            cout << num << " ";
        }
        cout << endl;
        cout << "~" << endl;
    }
    return 0;
}
// } Driver Code Ends