if(head == null)
{
		return null;
}


Node trav = head;


while(trav.next != null)
{
		//System.out.println(trav.next.data);
		trav = trav.next;
}

trav.next = trav;

return head;