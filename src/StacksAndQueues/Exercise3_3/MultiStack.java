package StacksAndQueues.Exercise3_3;

import java.util.ArrayList;
import java.util.List;

public class MultiStack {

	int size;
	Stack current;
	List<Stack> stacks;
	
	public MultiStack(int size) {
		this.size = size;
		stacks = new ArrayList<>();
		current = new Stack(size);
		stacks.add(current);
	}
	
	public boolean isEmpty() {
		return current.isEmpty();
	}
	
	private boolean isFull() {
		return current.isFull();
	}
	
	public void push(int value) {
		if ( isFull() ) {
			current = new Stack(size);
			stacks.add(current);
		}
		
		current.push(value);
	}
	
	public int peek() {
		if ( isEmpty() ) {
			throw new RuntimeException("Stack is empty");
		}
		
		return current.peek();
	}
	
	public int pop() {
		if ( isEmpty() ) {
			throw new RuntimeException("Stack is empty");
		}
		
		int toReturn = current.pop();
		
		if ( isEmpty() ) {
			if ( stacks.size() > 1 ) {
				stacks.remove(stacks.size() - 1);
				current = stacks.get(stacks.size() - 1);
			}
		}
		
		return toReturn;
	}
}
