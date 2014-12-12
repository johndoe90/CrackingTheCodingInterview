package SortingAndSearching.Exercise11_5;

public class Exercise11_5 {

	public static int indexOf(String[] arr, String str) {
		
		int i = 0;
		int middle;
		int left = 0;
		int right = arr.length - 1;
		
		while ( left <= right ) {
			middle = (left + right) / 2;

			i = 0;
			while ( true ) {
				if ( middle - i < left && middle + i > right ) {
					return -1;
				} else if ( middle - i >= left && arr[middle - i] != null ) {
					middle = middle - i;
					break;
				} else if ( middle + i <= right && arr[middle + i] != null ) {
					middle = middle + i;
					break;
				}
				
				i++;
			}
			
			if ( arr[middle].compareTo(str) == 0 ) {
				return middle;
			} else if ( arr[middle].compareTo(str) > 0 ) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		String[] arr = new String[] {"abc", "def", null, "ghi", "jkl", null, null, "mno", null, "pqr", null, "stu", "vwx", null, "yz", null };
	
		
		System.out.println(indexOf(arr, "ghi"));
	}
}
