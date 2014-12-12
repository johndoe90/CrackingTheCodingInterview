package StacksAndQueues.Exercise3_6;

import java.util.Stack;

public class Exercise3_6 {

	public static Stack<Integer> a = new Stack<>();
	public static Stack<Integer> b = new Stack<>();
	
	public static void sort1() {
		int min;
		boolean found;
		int size = a.size();
		

		
		while ( size > 0 ) {
			min = Integer.MAX_VALUE;
			for ( int i = 0; i < size; i++ ) {
				if ( a.peek() < min )
					min = a.peek();
				
				b.push(a.pop());
			}
			
			a.push(min);
			
			found = false;
			for ( int i = 0; i < size; i++ ) {
				if ( found || b.peek() != min ) {
					a.push(b.pop());
				} else {
					b.pop();
					found = true;
				}
			}
			
			size--;
		}
	}
	
	public static void sort2() {
		int temp;
		
		while ( !a.isEmpty() ) {
			temp = a.pop();
			while ( !b.isEmpty() && b.peek() > temp ) {
				a.push(b.pop());
			}
			
			b.push(temp);
		}
	}
	
	public static void main(String[] args) {
		a.push(5);
		a.push(2);
		a.push(2);
		a.push(7);
		a.push(6);
		a.push(3);
		a.push(0);
		a.push(9);
		
		//sort1();
		sort2();
		
		while ( !b.isEmpty() ) {
			System.out.println(b.pop());
		}
	}

}
