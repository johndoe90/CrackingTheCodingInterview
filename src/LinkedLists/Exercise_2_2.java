package LinkedLists;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Exercise_2_2 {

	public static Integer findKthLastElement(List<Integer> list, int k) {
		int i = 0;
		
		Iterator<Integer> it2 = null;
		Iterator<Integer> it1 = list.iterator();
		
		while ( it1.hasNext() ) {
			it1.next();
			if ( i++ >= k ) {
				if ( it2 == null )
					it2 = list.iterator();
				
				it2.next();
			}
		}
		
		return it2.next();
	}
	
	public static int findKthLastElement(Node node, int k) {
		if ( node == null ) {
			return 0;
		}
		
		int i = findKthLastElement(node.next, k) + 1;
		if ( i == k ) {
			System.out.println(node.data);
		}
		
		return i;
	}
	
	public static void main(String[] args) {
		/*int k = 3;
		List<Integer> list = new LinkedList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
		System.out.println(findKthLastElement(list, k));*/
		
		Node first = new Node(1);
		first.appendToTail(2);
		first.appendToTail(3);
		first.appendToTail(4);
		first.appendToTail(5);
		first.appendToTail(6);
		
		findKthLastElement(first, 2);
	}
}
