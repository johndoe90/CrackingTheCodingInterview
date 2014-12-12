package LinkedLists;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Exercise_2_1 {
	
	public static void removeDuplicates(List<Integer> list) {
		Integer current;
		HashMap<Integer, Object> map = new HashMap<>();
		
		Iterator<Integer> it = list.iterator();
		while ( it.hasNext() ) {
			current = it.next();
			if ( !map.containsKey(current) ) {
				map.put(current, null);
			} else {
				it.remove();
			}
		}
	}
	
	public static void removeDuplicates2(Node first) {
		Node one = first;
		Node second;
		Node prev;
		
		while ( one != null ) {
			prev = one;
			second = one.next;
			while ( second != null ) {
				if ( second.data == one.data ) {
					prev.next = second.next;
				}
				
				prev = second;
				second = second.next;
			}
			
			one = one.next;
		}
	}

	public static void main(String[] args) {
		Node first = new Node(7);
		first.appendToTail(7);
		first.appendToTail(3);
		first.appendToTail(8);
		first.appendToTail(2);
		first.appendToTail(9);
		first.appendToTail(4);
		first.appendToTail(3);
		first.appendToTail(5);
		
		removeDuplicates2(first);
		first.display();
		
		/*List<Integer> list = new LinkedList<Integer>(Arrays.asList(7,7,3,5,2,9,4,3));
		removeDuplicates(list);

		
		
		for ( int current : list ) {
			System.out.println(current);
		}*/
	}
}
