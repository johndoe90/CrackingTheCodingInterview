import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;


public class Exercise_2_5 {

	public static int sum(LinkedList<Integer> listA, LinkedList<Integer> listB) {
		//inorder
		int a, b, c = 0, i = 0, sum = 0;
		Stack<Integer> stack = new Stack<>();
		Iterator<Integer> itA = listA.iterator();
		Iterator<Integer> itB = listB.iterator();
		
		while ( itA.hasNext() || itB.hasNext() ) {
			a = itA.hasNext() ? itA.next() : 0;
			b = itB.hasNext() ? itB.next() : 0;
			
			stack.push(a);
			stack.push(b);
		}

		while ( !stack.isEmpty() ) {
			a = stack.pop();
			b = stack.pop();
			
			c = a + b + c;
			
			sum += c % 10 * Math.pow(10, i++);
			
			c = c / 10;
		}
		
		
		return sum;
		
		//reverse order
		/*int a, b, c = 0, sum = 0;
		int sizeA = listA.size(), sizeB = listB.size();
		int size = Math.max(listA.size(), listB.size());

		for ( int i = 0; i < size; i++ ) {	
			a = i < sizeA ? listA.get(sizeA - 1 - i) : 0;
			b = i < sizeB ? listB.get(sizeB - 1 - i) : 0;

			c = a + b + c;
			sum += c % 10 * Math.pow(10, i);
			c = c / 10;
		}
		
		return sum;*/
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> numberA = new LinkedList<>();
		numberA.add(6);
		numberA.add(1);
		numberA.add(7);
		
		LinkedList<Integer> numberB = new LinkedList<>();
		numberB.add(2);
		numberB.add(9);
		numberB.add(5);
		
		System.out.println(sum(numberA, numberB));
	}
}
