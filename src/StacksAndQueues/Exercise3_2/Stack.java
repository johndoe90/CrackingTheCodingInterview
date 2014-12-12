package StacksAndQueues.Exercise3_2;

public class Stack {
	
	int top;
	Node[] nodes;
	
	public Stack(int size) {
		top = -1;
		nodes = new Node[size];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == nodes.length - 1;
	}
	
	public int peek() {
		return nodes[top].val;
	}
	
	public void push(int val) {
		if ( isFull() ) return;		
		
		int min = min();
		nodes[++top] = new Node(val, min);
	}
	
	public int pop() {
		if ( isEmpty() ) return -1;
		return nodes[top--].val;
	}
	
	public int min() {
		if ( isEmpty() ) return Integer.MAX_VALUE;
		
		return nodes[top].min;
	}
}
