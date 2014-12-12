package ArraysAndStrings;

public class Exercise_1_6 {

	public static void print(char[][] arr) {
		for ( int i = 0; i < arr.length; i++ ) {
			for ( int j = 0; j < arr[i].length; j++ ) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public static void rotate90deg(char[][] arr) {
		char temp;
		int level = 0;
		int N = arr.length;
		
		while ( level < N / 2 ) {
			for ( int i = level; i < N - 1 - level; i++ ) {
				temp = arr[level][i];
				
				arr[level][i] = arr[N-1-i][level];
				
				arr[N-1-i][level] = arr[N-1-level][N-1-i];
				
				arr[N-1-level][N-1-i] = arr[i][N-1-level];
				
				arr[i][N-1-level] = temp;
			}
			
			level++;
		}
	}
	
	public static void main(String[] args) {
		int N = 4;
		char[][] arr = {{'A', 'B', 'C', 'D', 'E'}, {'F', 'G', 'H', 'I', 'J'}, {'K', 'L', 'M', 'N', 'O'}, {'P', 'Q', 'R', 'S', 'T'}, {'U', 'V', 'W', 'X', 'Y'}};
		
		print(arr);
		System.out.println("------------------");
		rotate90deg(arr);
		rotate90deg(arr);
		print(arr);
	}
}
