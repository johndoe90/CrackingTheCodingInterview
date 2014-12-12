package LinkedLists;

public class Node {
		
	Node next;
	int data;
		
	public Node(int data) {
		this.data = data;
	}
		
	public void appendToTail(int data) {
		Node current = this;
		Node newNode = new Node(data);
		while ( current.next != null ) {
			current = current.next;
		}
			
		current.next = newNode;
	}
	
	public void display() {
		Node current = this;
		while ( current != null ) {
			System.out.println(current.data);
			current = current.next;
		}
	}
}
