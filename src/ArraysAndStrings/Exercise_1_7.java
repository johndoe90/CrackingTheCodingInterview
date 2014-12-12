package ArraysAndStrings;



public class Exercise_1_7 {

	public static void print(int[][] arr) {
		for ( int i = 0; i < arr.length; i++ ) {
			for ( int j = 0; j < arr[i].length; j++ ) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public static void analyze(int[][] matrix, int M, int N) {
		boolean[] deleteRow = new boolean[M];
		boolean[] deleteColumn = new boolean[N];
		
		for ( int i = 0; i < M; i++ ) {
			for ( int j = 0; j < N; j++ ) {
				if ( matrix[i][j] == 0 ) {
					deleteRow[i] = true;
					deleteColumn[j] = true;
				}
			}
		}
		
		for ( int i = 0; i < M; i++ ) {
			for ( int j = 0; j < N; j++ ) {
				if ( deleteRow[i] || deleteColumn[j] ) {
					matrix[i][j] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,0,1}};
		//print(matrix);
		
		analyze(matrix, 4, 4);
		
		print(matrix);
	}
}
