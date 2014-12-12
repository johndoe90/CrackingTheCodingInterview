package BitManipulation.Exercise5_5;

public class Exercise5_5 {

	public static int bitsRequired(int a, int b) {
		int bits = 0;
		while ( a != 0 || b != 0 ) {
			if ( ((a ^ b) & 1) != 0 ) 
				bits++;
			
			a >>= 1;
			b >>= 1;
		}
		
		return bits;
	}
	
	public static int bitsRequired2(int a, int b) {
		int bits = 0;
		for ( int c = a ^ b; c != 0; c >>= 1 ) {
			bits += c & 1;
		}
		
		return bits;
	}
	
	public static void main(String[] args) {
		int a = 0b0;
		int b = 0b101;
		
		System.out.println(bitsRequired2(a, b));
	}
}
