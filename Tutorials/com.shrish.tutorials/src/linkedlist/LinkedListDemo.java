package linkedlist;

class LinkedList {
	
	int data;                //Data field of the linked list
	LinkedList next;         //Pointer to the next node
	
	LinkedList()
	{
	  this.next = null;
	}
	
	
	

} // end of LinkedList class


class LinkedListDemo{
	
	public static void main(String args[])
	{
		//creating some sample fields
		LinkedList a = new LinkedList();
		LinkedList b = new LinkedList();
		LinkedList c = new LinkedList();
		LinkedList d = new LinkedList();
		LinkedList e = new LinkedList();
		LinkedList head = new LinkedList();
		LinkedList traverse = new LinkedList();
		
		
		head = a;
		traverse=head;
		// storing some sample data
		
		a.data = 1;
		b.data = 2;
		c.data = 3;
		d.data = 2;
		e.data = 1;
		
		// linking the lists
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		//traversing the list using a while loop
		
		while(traverse !=null)
		{
			System.out.print(traverse.data+"-->");
			traverse = traverse.next;
		}
		
		
	}// end of main
	
	
}// end of LinkedListDemo class