//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    struct Node *left;
    struct Node *right;

    Node(int x) {
        data = x;
        left = right = NULL;
    }
};

// Function to Build Tree
Node *buildTree(string str) {
    // Corner Case
    if (str.length() == 0 || str[0] == 'N')
        return NULL;

    // Creating vector of strings from input
    // string after spliting by space
    vector<string> ip;

    istringstream iss(str);
    for (string str; iss >> str;)
        ip.push_back(str);

    // Create the root of the tree
    Node *root = new Node(stoi(ip[0]));

    // Push the root to the queue
    queue<Node *> queue;
    queue.push(root);

    // Starting from the second element
    int i = 1;
    while (!queue.empty() && i < ip.size()) {

        // Get and remove the front of the queue
        Node *currNode = queue.front();
        queue.pop();

        // Get the current node's value from the string
        string currVal = ip[i];

        // If the left child is not null
        if (currVal != "N") {

            // Create the left child for the current node
            currNode->left = new Node(stoi(currVal));

            // Push it to the queue
            queue.push(currNode->left);
        }

        // For the right child
        i++;
        if (i >= ip.size())
            break;
        currVal = ip[i];

        // If the right child is not null
        if (currVal != "N") {

            // Create the right child for the current node
            currNode->right = new Node(stoi(currVal));

            // Push it to the queue
            queue.push(currNode->right);
        }
        i++;
    }

    return root;
}


// } Driver Code Ends
//Back-end complete function Template for C++
class Solution {
  public:
    // Function to find the vertical width of a Binary Tree.
    int verticalWidth(Node* root) {
        // code here
                if(!root)return 0;
        queue<pair<Node*,int>> q;
        map<int,int> mpp;
        q.push({root,0});
        while(!q.empty()){
            auto it=q.front();q.pop();
            Node* temp=it.first;
            int x=it.second;
            if(!mpp[x])mpp[x]=1;
            
            if(temp->left){
                q.push({temp->left,x-1});
            }
            if(temp->right){
                q.push({temp->right,x+1});
            }
        }
        return mpp.size();
    }
};


//{ Driver Code Starts.
int main() {
    int tc;
    scanf("%d ", &tc);
    while (tc--) {
        string str;
        getline(cin, str);
        Solution obj;
        Node *root = buildTree(str);

        cout << obj.verticalWidth(root) << "\n";
    }

    return 0;
}

// } Driver Code Ends