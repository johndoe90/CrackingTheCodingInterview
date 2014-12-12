package LinkedLists;


public class Exercise_2_3 {

	public static void delete(Node node) {
		if ( node != null || node.next != null ) {
			node.data = node.next.data;
			node.next = node.next.next;
		}
	}
	
	public static void main(String[] args) {
		Node first = new Node(1);
		Node middle = new Node(2);
		first.next = middle;
		first.appendToTail(3);
		first.appendToTail(4);
		
		//delete(middle);
		
		first.display();
	}
}
