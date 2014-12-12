package StacksAndQueues.Exercise3_3;

public class Exercise3_3 {
	public static void main(String[] args) {
		MultiStack stack = new MultiStack(2);
		
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		stack.push(0);
		
		while ( !stack.isEmpty() ) {
			System.out.println(stack.pop());
		}
	}
}
