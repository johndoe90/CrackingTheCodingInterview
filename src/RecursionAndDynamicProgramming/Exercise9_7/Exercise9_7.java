package RecursionAndDynamicProgramming.Exercise9_7;

public class Exercise9_7 {
	
	public static void fill(char[][] matrix, char fill, int x, int y) {
		char color = matrix[y][x];
		matrix[y][x] = fill;		
		
		if ( x > 0 && matrix[y][x-1] == color ) {
			fill(matrix, fill, x - 1, y);
		}
		
		if ( y > 0 && matrix[y - 1][x] == color ) {
			fill(matrix, fill, x, y - 1);
		}
		
		if ( x < matrix[0].length - 1 && matrix[y][x + 1] == color ) {
			fill(matrix, fill, x + 1, y);
		}
		
		if ( y < matrix.length - 1 && matrix[y + 1][x] == color ) {
			fill(matrix, fill, x, y + 1);
		}
	}
	
	public static void main(String[] args) {
		int x = 3;
		int y = 3;
		
		char[][] matrix = new char[y][x];
		
		matrix[0][0] = 'A';
		matrix[0][1] = 'A';
		matrix[0][2] = 'B';
		
		matrix[1][0] = 'B';
		matrix[1][1] = 'A';
		matrix[1][2] = 'B';
		
		matrix[2][0] = 'B';
		matrix[2][1] = 'A';
		matrix[2][2] = 'A';

		fill(matrix, 'F', 0, 0);
		
		for ( int i = 0; i < matrix.length; i++ ) {
			for ( int j = 0; j < matrix[0].length; j++ ) {
				System.out.print(matrix[i][j] + " ");
			}
			
			System.out.println("");
		}
	}
}
