package Exercise14_6;

import java.util.Iterator;

public class CircularArrayIterator<T> implements Iterator<T> {

	int pos;
	int toDo;
	CircularArray<T> arr;
	
	public CircularArrayIterator(CircularArray<T> arr) {
		this.arr = arr;
		pos = arr.first;
		toDo = arr.data.length - 1;
	}
	
	@Override
	public boolean hasNext() {
		return toDo >= 0;
	}

	@Override
	public T next() {
		T toReturn =  arr.data[pos] != null ? arr.data[pos].data : null;
		pos = (pos + 1) % arr.data.length;
		toDo--;
		
		return toReturn;
	}
}
