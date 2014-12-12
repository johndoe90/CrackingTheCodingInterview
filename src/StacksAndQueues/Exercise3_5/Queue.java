package StacksAndQueues.Exercise3_5;

import java.util.Stack;

public class Queue {
	
	Stack<Integer> stacked = new Stack<>();
	Stack<Integer> queued = new Stack<>();
	
	public boolean isEmpty() {
		return stacked.isEmpty() && queued.isEmpty();
	}
	
	public void push(int val){
		/*if ( !queued.isEmpty() ) {
			System.out.println("Resort");
			while ( !queued.isEmpty() ) {
				stacked.push(queued.pop());
			}
		}*/
		
		stacked.push(val);
	}
	
	public int pop() {
		if ( !stacked.isEmpty() ) {
			System.out.println("Resort");
			while ( !stacked.isEmpty() ) {
				queued.push(stacked.pop());
			}
		}
		
		return queued.pop();
	}
	
	public int peek() {
		if ( !stacked.isEmpty() ) {
			System.out.println("Resort");
			while ( !stacked.isEmpty() ) {
				queued.push(stacked.pop());
			}
		}
		
		return queued.peek();
	}
}
