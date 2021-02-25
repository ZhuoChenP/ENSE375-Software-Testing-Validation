
public class DoublyLinkedList {
	private class Node{  //private class which is only used in DoublyLinkedList class
		private int value;
		private Node previous;
		private Node next;
		public Node(int value) 
		{
			this.value=value;
		}
		public void jointNext(Node next)
		{
			this.next=next;     // link the next Node to this.Next 
			next.previous=this; // link the previous Node of parameter Node Next to the current node==> this 
		}
		public void joinPrevious(Node previous)
		{
			this.previous=previous; // link the previous  Node to this.previous 
			this.previous.next=this; // link the next Node of node previous to the current node==> this
		}
		public void removeNext()
		{
			this.next=null;
		}
		public void removePrevious()
		{
			this.previous=null;
		}
		public Node getNext()
		{
			return this.next;
		}
		public Node getPrevious()
		{
			return this.previous;
		}
		public int getValue()
		{
			return value;
		}
	}
	private Node head;
	private Node tail;
	public void prepend(int input)
	{	
		if(head==null) // check if the linked list is empty
		{
			head=new Node(input);
			tail=head; // tail and head are some node if there is only one node in the linked list
		}
		else {
		Node temp=new Node(input); 
		this.head.joinPrevious(temp); // add the input parameter at first opsition of linked list
		this.head=temp; // assign the first node in the linked list is head
		}
	}
	public void append (int input)
	{
		if(head==null)
		{	
			head=new Node(input);
			tail=head;
		}
		else {
		Node temp=new Node(input);
		this.tail.jointNext(temp);
		this.tail=temp;
		}
	}
	public int popFront () {
		Node temp=this.head.next; //set the head node
		Node delete=this.head; //set delete node
		delete.removeNext(); //break the link from delete to its next node
		temp.removePrevious();// break the link from the next node of head to head
		head=temp;// set the new head node
		return delete.getValue();//return deelted value
	}
	public int popBack  () {
		Node temp=this.tail.previous;
		Node delete=this.tail;
		delete.removePrevious();
		temp.removeNext();
		tail=temp;
		return delete.getValue();
	}
	public void printForward()
	{
		Node temp=head; // a printing node go through from head to tail
		while(temp!=null)
		{
			System.out.println(temp.getValue()); // print the value of the temp node
			temp=temp.getNext(); //move the next node
		}
		
		
	}
	public void printReverse()
	{
		Node temp=tail;
		while(temp!=null)
		{
			System.out.println(temp.getValue());
			temp=temp.getPrevious();
		}
		
	}
}
