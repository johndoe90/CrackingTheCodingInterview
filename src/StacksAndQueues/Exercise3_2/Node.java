package StacksAndQueues.Exercise3_2;

public class Node {
	int val;
	int min;
	
	public Node(int val, int min) {
		this.val = val;
		this.min = val < min ? val : min;
	}
}
