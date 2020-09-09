class MyLinkedList {
    Node head;
    int val;
    
    class Node {
        int val;
        Node next;
    
        Node(int x){
            val = x;
        }
    }
    

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = null;
        
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
       
        Node curNode = head;
        int counter = 0;
        
        
        while(curNode != null){
           if(counter == index){
              return curNode.val;   
           }
           curNode = curNode.next;
           counter++;
        }
        
        return -1;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node curNode = new Node(val);
        curNode.next = head;
        head = curNode;
    }
    
    /** Append a node of value val to the last element of the linked list.*/
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = new Node(val);
            return;
        }
        
        newNode.next = null;
        
        Node curNode = head;
        
        while(curNode.next != null){
            curNode = curNode.next;
        }
        
        curNode.next = newNode;
        return;
        
    }
    

    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        
    }
}