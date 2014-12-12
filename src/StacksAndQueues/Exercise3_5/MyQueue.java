package StacksAndQueues.Exercise3_5;

import java.util.Stack;

public class MyQueue {

	Stack<Integer> newest = new Stack<>();
	Stack<Integer> oldest = new Stack<>();
	
	private void shift() {
		if ( oldest.isEmpty() ) {
			while ( !newest.isEmpty() ) {
				oldest.push(newest.pop());
			}
		}
	}
	
	public boolean isEmpty() {
		return newest.isEmpty() && oldest.isEmpty();
	}
	
	public void push(int val) {
		newest.push(val);
	}
	
	public int peek() {
		shift();
		return oldest.peek();
	}
	
	public int pop() {
		shift();
		return oldest.pop();
	}
}
