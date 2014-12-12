package StacksAndQueues.Exercise3_4;

import java.util.Stack;

public class Exercise3_4 {
	
	public static void hanoi(int n, char from, char inter, char to) {
		if ( n == 1 ) {
			System.out.println("Move " + from + " to " + to);
			return;
		}
		
		hanoi(n - 1, from, to, inter);
		System.out.println("Move " + from + " to " + to);
		hanoi(n - 1, inter, from, to);
	}
	
	public static void main(String[] args) {
		hanoi(2, 'A', 'B', 'C');
	}
}
