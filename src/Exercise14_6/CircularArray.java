package Exercise14_6;

import java.util.Iterator;

public class CircularArray<T> implements Iterable<T> {

	int first = 0;
	Node<T>[] data;
	
	public CircularArray(int size) {
		data = new Node[size];
	}
	
	private void checkIndex(int index) {
		if ( index < 0 || index >= data.length ) {
			throw new ArrayIndexOutOfBoundsException("");
		}
	}
	//use offset
	public T get(int index) {
		checkIndex(index);
		
		index = (first + index) % data.length;
		
		return data[index].data;
	}
	
	public void set(int index, T val) {
		checkIndex(index);
		
		index = (first + index) % data.length;
		
		data[index] = new Node<T>(val);
	}
	
	public void rotateLeft() {
		rotateLeft(1);
	}
	
	public void rotateRight() {
		rotateRight(1);
	}
	
	public void rotateLeft(int n) {
		if ( n < 0 || n > data.length ) 
			return;
		
		first = (first + n) % data.length;
	}
	
	public void rotateRight(int n) {	
		if ( n < 0 || n > data.length )
			return;
		
		first = ((first - n) + data.length) % data.length; 
	}

	@Override
	public Iterator<T> iterator() {
		return new CircularArrayIterator<T>(this);
	}
}
