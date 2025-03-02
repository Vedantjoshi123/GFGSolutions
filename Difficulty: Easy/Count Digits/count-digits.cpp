//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
  public:
    // Function to count the number of digits in n that evenly divide n
    int evenlyDivides(int num) {
        int count = 0;
        int n = num;
        while(num>0){
            int rem = num%10;
            if(rem!=0 && n%rem == 0){
                count++;
            }
            num /= 10;
        }
        return count;
    }
};


//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin >> N;
        Solution ob;
        cout << ob.evenlyDivides(N) << endl;

        cout << "~"
             << "\n";
    }
    return 0;
}
// } Driver Code Ends