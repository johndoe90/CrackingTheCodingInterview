package SortingAndSearching.Exercise11_1;

public class Exercise11_1 {
	
	public static void swap(int[] A, int[] B, int a, int b) {
		int temp = A[a];
		A[a] = B[b];
		B[b] = temp;
	}
	
	public static void merge(int[] A, int[] B, int lastA, int lastB) {
		int j, count = 0; 
		for ( int i = 0; i <= lastB; i++ ) {
			count++;
			j = lastA + i + 1;
			while ( j > 0 && A[j-1] > B[i] ) {
				count++;
				A[j] = A[--j];
			}
			
			A[j] = B[i];
		}
		
		System.out.println("Count: " + count);
	}
	
	//for when A is much longer than B
	public static void merge2(int[] A, int[] B, int lastA, int lastB) {
		int count = 0;
		
		int j, temp;
		for ( int i = 0; i <= lastA; i++ ) {
			count++;
			
			if ( A[i] > B[0] ) {
				swap(A, B, i, 0);
			}
			
			j = 1;
			temp = B[0];
			while ( j <= lastB && temp > B[j] ) {
				count++;
				B[j-1] = B[j++];
			}
			
			B[j-1] = temp; 
		}
		
		for ( int i = 0; i <= lastB; i++ ) {
			count++;
			A[i + lastA + 1] = B[i];
		}
		
		System.out.println("Count: " + count);
	}
	
	public static void merge3(int[] A, int[] B, int lastA, int lastB) {
		int i = lastA;
		int j = lastB;
		
		int k = A.length - 1;
		while ( i >= 0 && j >= 0 ) { 
			if ( A[i] > B[j] ) {
				A[k--] = A[i--];
			} else {
				A[k--] = B[j--];
			}
		}
		
		while ( j >= 0 ) {
			A[k--] = B[j--];
		}
	}

	public static void main(String[] args) {
		int[] A = new int[10];

		for ( int i = 0; i < 5; i++ ) {
			A[i] = 2 * (i+1);
		}
		
		int[] B = new int[] {1,7,9,11,13,15};
		
		merge3(A, B, 4, 4);
		
		for ( int a : A ) {
			System.out.println(a);
		}
	}

}
