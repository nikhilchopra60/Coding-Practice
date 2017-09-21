// Java program to find middle of linked list
class LinkedList
{
	Node head; // head of linked list

	/* Linked list node */
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/* Function to print middle of linked list */
/*	void printMiddle()
	{
		Node slow_ptr = head;
		Node fast_ptr = head;
		if (head != null)
		{
			while (fast_ptr != null && fast_ptr.next != null)
			{
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
			}
			System.out.println("The middle element is [" +
								slow_ptr.data + "] \n");
		}
	}*/
	
	
	
	public void printMiddle(){
	 
	 Node current=head;
	 int count=1;
	 while(current.next!=null){
		 count++;
		 current=current.next;
		 //System.out.println("Counting number of nodes=" + count);
	 }
	 //System.out.println("total number of nodes=" + count);
	 int count2=0;
	 Node current2=head;
	 if(count%2==0){
		 while(count2!=(count/2)-1 && current2.next!=null && current2.next.next!=null){
		     count2++;
		     current2=current2.next;
		 }
		 System.out.println("Middle Element= "+current2.data);
		 System.out.println("Middle Element= "+current2.next.data);
	 }
	 else{
		 while(count2!=((count+1)/2)-1 && current2.next!=null){
		      //System.out.println("inside odd while coun2=" + count2);
			 count2++;
			 current2=current2.next;
		 }
		 System.out.println("Middle Element= "+current2.data);
	 }
 }

	/* Inserts a new Node at front of the list. */
	public void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/* This function prints contents of linked list
	starting from the given node */
	public void printList()
	{
		Node tnode = head;
		while (tnode != null)
		{
			System.out.print(tnode.data+"->");
			tnode = tnode.next;
		}
		System.out.println("NULL");
	}

	public static void main(String [] args)
	{
		LinkedList llist = new LinkedList();
		for (int i=5; i>0; --i)
		{
			llist.push(i);
			llist.printList();
			llist.printMiddle();
		}
	}
}
// This code is contributed by Rajat Mishra
