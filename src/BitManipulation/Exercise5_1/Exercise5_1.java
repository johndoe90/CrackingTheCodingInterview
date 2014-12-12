package BitManipulation.Exercise5_1;

public class Exercise5_1 {

	public static int insertMintoN(int N, int M, int i, int j) {		
		int ones = ~0;
		int left = ones << (j + 1);
		int right = (1 << i) - 1;
		
		int mask = left | right;
		
		M <<= i;
		
		return ((N & mask) | M);
	}
	
	public static void main(String[] args) {
		int N = 0b10000000000;
		int M = 0b10011;
		
		System.out.println(Integer.toBinaryString(insertMintoN(N, M, 2, 6)));
	}
}
