package LinkedLists;

public class Exercise_2_4 {

	public static void partition(Node first, int val) {
		if ( first == null ) return;
		
		Node smaller = null;
		Node larger = null;

		Node current = first;
		while ( current != null ) {
			if ( current.data < val ) {
				if ( smaller == null ) {
					smaller = new Node(current.data);
				} else {
					smaller.appendToTail(current.data);
				}
			} else {
				if ( larger == null ) {
					larger = new Node(current.data);
				} else {
					larger.appendToTail(current.data);
				}
			}
			
			current = current.next;
		}
		
		first = smaller;
	}
	
	public static void main(String[] args) {
		Node first = new Node(7);
		first.appendToTail(4);
		first.appendToTail(3);
		first.appendToTail(9);
		first.appendToTail(2);
		first.appendToTail(5);
		first.appendToTail(14);
		first.appendToTail(1);
		
		first.display();
		
		System.out.println("-----------------");
		
		partition(first, 5);
		
		
		first.display();
	}
}
