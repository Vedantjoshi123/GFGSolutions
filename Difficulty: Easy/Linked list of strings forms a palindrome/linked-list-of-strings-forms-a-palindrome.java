//{ Driver Code Starts
import java.util.*;

class Node {
    String data;
    Node next;

    Node(String x) {
        data = x;
        next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() { head = null; }

    void addNode(String str) {
        if (head == null) {
            head = new Node(str);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(str);
        }
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int K = sc.nextInt();
            LinkedList list = new LinkedList();

            for (int i = 0; i < K; i++) {
                String str = sc.next();
                list.addNode(str);
            }

            Solution ob = new Solution();
            boolean ans = ob.compute(list.head);
            if (ans) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        sc.close();
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public boolean compute(Node root) {
        String str="";
        while(root!=null){
            str+=root.data;
            root=root.next;
        }
        
        // two pointer technique to check palindrome
        int i=0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}