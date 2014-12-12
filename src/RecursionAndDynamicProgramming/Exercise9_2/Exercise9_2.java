package RecursionAndDynamicProgramming.Exercise9_2;

public class Exercise9_2 {

	public static int goTo(int X, int Y) {
		if ( X > 0 && Y > 0 ) 
			return goTo(X - 1, Y) + goTo(X, Y - 1);
		 else 
			 return 1;
	}
	
	public static int goTo2(boolean[][] forbidden, int X, int Y) {
		if ( forbidden[X][Y] ) {
			return 0;
		}
		
		if ( X > 0 && Y > 0 ) 
			return goTo2(forbidden, X - 1, Y) + goTo2(forbidden, X, Y - 1);
		 else 
			 return 1;
	}
	
	public static void main(String[] args) {
		int X = 3, Y = 3;
		boolean[][] forbidden = new boolean[X][Y];
		
		forbidden[2][0] = true;
		forbidden[0][2] = true;
		//forbidden[1][1] = true;
		
		
		
		System.out.println(goTo2(forbidden, X - 1, Y - 1));
	}

}
