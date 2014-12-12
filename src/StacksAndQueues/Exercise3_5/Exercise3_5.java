package StacksAndQueues.Exercise3_5;

public class Exercise3_5 {

	public static void main(String[] args) {
		//Queue queue = new Queue();
		MyQueue queue = new MyQueue();
		
		
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.push(5);
		queue.push(6);
		
		while ( !queue.isEmpty() ) {
			System.out.println(queue.pop());
		}
	}
}
