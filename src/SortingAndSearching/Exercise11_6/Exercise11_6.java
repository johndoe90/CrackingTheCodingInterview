package SortingAndSearching.Exercise11_6;

public class Exercise11_6 {

	public static boolean found(int[][] matrix, int val) {
		int N = matrix.length;
		int M = matrix[0].length;
		
		int middle, top, bottom, i = 0;
		while ( i < M && matrix[0][i] <= val ) {
			if ( matrix[0][N-1] >= val ) {
				//binarysearch this column
				top = 0;
				bottom = N - 1;
				while ( top <= bottom ) {
					middle = ( top + bottom ) / 2;
					
					if ( matrix[middle][i] == val ) {
						return true;
					} else if ( matrix[middle][i] > val ) {
						bottom = middle - 1;
					} else {
						top = middle + 1;
					}
				}
			}
			
			i++;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int val = 99;
		int[][] matrix = new int[][] {{1,5,9,13}, {2,6,10,14}, {3,7,11,15}, {4,8,12,16}};
		System.out.println("Found " + val + ": " + found(matrix, val));
	}
}
