/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node slow = head ;
        Node fast = head ;
        int count = 0 ; 
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next ;
            fast = fast.next.next ;
            
            if(slow == fast)
            { slow = slow.next ;
              fast = fast.next.next ;
                while(slow != fast)
                {
                    count++ ;
                    slow = slow.next ;
                    fast = fast.next.next ;
                }
                return count+1 ; 
            }
        }
        return count ; 
    }
}