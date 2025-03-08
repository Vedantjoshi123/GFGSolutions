//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

#include <bits/stdc++.h>

class Solution {
  public:
    vector<int> lcmAndGcd(int a, int b) {
        // int lcm = lcmfun(a, b);
        // int hcf = hcffun(a, b);
        int lcm = euclideanAlgo(a, b);  // O(log(min(a,b)));
        // lcm*hcf = a*b;
        int hcf = (a*b)/lcm;
        // cout<<"lcm: "<<lcm;
        // cout<<"hcf: "<<hcf;
        return {hcf, lcm}; 
    }
    
    static int euclideanAlgo(int a, int b){
        // lcm(a, b) = lcm(a%b, b)  where a is larger number and b is smaller number
        while(a>0 && b>0){
            if(a>b){
                a = a%b;
            }
            else {
                b = b%a;
            }
        }
        if(a==0) return b;
        return a;
    }   
    
    static int hcffun(int a, int b){
        int hcf = 1;
        int minNum = min(a, b);
        for(int i= minNum; i>1; i--){
            if(a%i == 0 && b%i == 0){
                hcf = i;
                break; 
            }
        }
        return hcf;
    }
    static int lcmfun(int a, int b){
        for(int i=max(a,b); i<=a*b; i++){
            if(i%a==0 && i%b==0){
                return i;
            }
        }
        return a*b;
    }
    
};


//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    cin.ignore();
    while (t--) {
        int A, B;

        cin >> A >> B;

        Solution ob;
        vector<int> ans = ob.lcmAndGcd(A, B);
        cout << ans[0] << " " << ans[1] << endl;
        cout << "~" << endl;
    }
    return 0;
}

// } Driver Code Ends