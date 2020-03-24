public static  Node insert(Node head,int data) {
		//Complete this method

		Node trav = head;
		
		if(head == null)
		{
				return new Node(data);
		}
		else
		{
				Node last = head;
				while(last.next != null)
				{
						last = last.next;
						System.out.println(last);
				}
		}

		trav.next = null;

		Node last = head;

		
		last.next = trav;

		return head;
}