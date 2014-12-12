package Java.Exercise14_6;

public class CircularArrayTest {

	public static void main(String[] args) {
		CircularArray<Integer> arr = new CircularArray<Integer>(10);
		
		arr.set(0, 0);
		arr.set(1, 1);
		arr.set(2, 2);
		arr.set(3, 3);
		arr.set(4, 4);
		arr.set(5, 5);
		arr.set(6, 6);
		arr.set(7, 7);
		arr.set(8, 8);
		arr.set(9, 9);
		
		arr.rotateRight(2);
		
		System.out.println(arr.get(0));
		
		for ( Integer cur : arr ) {
			System.out.println(cur);
		}
	}
}
