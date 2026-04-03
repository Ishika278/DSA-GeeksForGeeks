// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
      Node head,rear;
        
    public myQueue() {
        // Initialize your data members
        head = null; 
        rear = null;
    }
      
  
        
    public boolean isEmpty() {
        // check if the queue is empty
        if(head == null)
        {
         return true;
         }
          else{
           return false;
         }
        
    }

    public void enqueue(int x) {
        // Adds an element x at the rear of the queue.
        Node newNode = new Node(x);
        if(head == null)
        {
            head = newNode;
            rear = newNode;
        }
        else
        {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue() {
        // Removes the front element of the queue
        if(head == null)
        {
            return;
        }
        else{
            head = head.next;
            if(head == null)
            {
                rear = null;
            }
        }
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        if(head == null)
        {
            return -1;
        }else{
            return head.data;
        }
    }

    public int size() {
        // Returns the current size of the queue.
        Node temp = head;
        int count = 0;
        
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
