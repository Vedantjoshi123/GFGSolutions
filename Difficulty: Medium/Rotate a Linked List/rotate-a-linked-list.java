//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


// } Driver Code Ends
/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution {
     public Node rotate(Node head, int k) {
   if(head == null || head.next == null) return head;
        if(head.next.next == null) {
            if(k % 2 == 0) return head;
            head.next.next = new Node(head.data);
            return head.next;
        }
        Node temp = head;
        int c = 0;
        while(temp != null) {
            temp = temp.next;
            c++;
        }
        k = k % c;
        if(k == 0) return head;
        temp = head;
        while(--k != 0) {
            temp = temp.next;
        }
        if(temp.next == null) {
            return head;
        }
        Node head2 = temp.next;
        temp.next = null;
        temp = head2;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        return head2;
    }
}


//{ Driver Code Starts.

public class GFG {
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine().trim();
            if (!input.isEmpty()) {
                String[] numbers = input.split("\\s+");
                for (String num : numbers) {
                    if (!num.isEmpty()) {
                        arr.add(Integer.parseInt(num));
                    }
                }
            }

            Node head = null;
            if (!arr.isEmpty()) {
                head = new Node(arr.get(0));
                Node tail = head;
                for (int i = 1; i < arr.size(); ++i) {
                    tail.next = new Node(arr.get(i));
                    tail = tail.next;
                }
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            head = ob.rotate(head, k);
            printList(head);
        }
    }
}

// } Driver Code Ends