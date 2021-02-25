
public class Main {
	public static void main (String[] args) {
	DoublyLinkedList myList = new DoublyLinkedList();
	myList.append(3);
	myList.append(4);
	myList.append(5);
	myList.prepend(2);
	myList.prepend(1);
	System.out.println("Print the list forward:");
	myList.printForward();
	System.out.println();
	System.out.println("Print the list backward:");
	myList.printReverse();
	System.out.println();
	System.out.println("Remove and print the first element:");
	System.out.println(myList.popFront());
	System.out.println("Remove and print the last element:");
	System.out.println(myList.popBack());
	System.out.println();
	System.out.println("Print the list forward:");
	myList.printForward();
	System.out.println();
	System.out.println("Print the list backward:");
	myList.printReverse();
	}
}
