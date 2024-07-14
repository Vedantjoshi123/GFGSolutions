//{ Driver Code Starts
// Initial template for C++
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function template for C++

class Solution {
  public:
    void segregate0and1(vector<int> &arr) {
        int zero = 0; //pointer to point out 1's 
        int one=arr.size()-1; //pointer to point out 0's

       while(zero < one){

 // Move zero pointer to the right until a 1 is found
            while(zero<one && arr[zero] == 0) zero++;

// Move one pointer to the left until a 0 is found
            while(zero<one && arr[one] == 1) one--;


   // Swap elements if zero is still less than one          
            if(zero < one)  swap(arr[zero],arr[one]);    
       }
    }
};

//{ Driver Code Starts.
int main() {
    int t;

    cin >> t;
    cin.ignore();
    while (t--) {
        vector<int> arr;
        string input;
        getline(cin, input);
        stringstream ss(input);
        int number;
        while (ss >> number) {
            arr.push_back(number);
        }
        int n = arr.size();
        Solution ob;
        ob.segregate0and1(arr);
        for (int i = 0; i < n; i++) {
            cout << arr[i] << " ";
        }
        cout << "\n";
    }
    return 0;
}
// } Driver Code Ends