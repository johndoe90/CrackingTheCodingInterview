package StacksAndQueues.Exercise3_3;

public class Stack {
	
	int top;
	int[] nodes;
	
	public Stack(int size) {
		top = -1;
		nodes = new int[size];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == nodes.length - 1;
	}
	
	public int peek() {
		if ( isEmpty() ) {
			throw new RuntimeException("Stack is empty");
		}
		
		return nodes[top];
	}
	
	public void push(int val) {
		if ( isFull() ) {
			throw new RuntimeException("Stack is Full");
		}
		
		nodes[++top] = val;
	}
	
	public int pop() {
		if ( isEmpty() ) {
			throw new RuntimeException("Stack is empty");
		}
		
		return nodes[top--];
	}
}
