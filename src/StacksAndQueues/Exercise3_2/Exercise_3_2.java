package StacksAndQueues.Exercise3_2;

public class Exercise_3_2 {
	public static void main(String[] args) {
		Stack stack = new Stack(10);
		
		stack.push(5);
		stack.push(7);
		stack.push(4);
		stack.push(2);
		
		System.out.println(stack.pop());
		
		
		
		System.out.println(stack.min());
	}
}
