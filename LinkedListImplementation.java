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
    
    public MyLinkedList() {
        head = null;
        
    }
    

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
    

    public void addAtHead(int val) {
        Node curNode = new Node(val);
        curNode.next = head;
        head = curNode;
    }
    

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
    
    public void addAtIndex(int index, int val) {
        
    }
    
    public void deleteAtIndex(int index) {
        
    }
}