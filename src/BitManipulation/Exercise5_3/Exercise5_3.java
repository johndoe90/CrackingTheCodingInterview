package BitManipulation.Exercise5_3;

public class Exercise5_3 {

	public static int nextLargest(int num) {
		int i = 1;
		boolean one = false, zero = false;
		
		while ( !one || !zero ) {
			if ( !zero && one && (num & i) == 0 ) {
				zero = true;
				num |= i;
			}
			
			if ( !one && (num & i) != 0 ) {
				one = true;
				num &= ~i;
			}
			
			i <<= 1;
		}
		
		return num;
	}
	
	public static int nextSmallest(int num) {
		int i = 1;
		boolean one = false, zero = false;
		
		while ( !one || !zero ) {
			if ( zero && !one && (num & i) != 0 ) {
				one = true;
				num &= ~i;
			}
			
			if ( !zero && (num & i) == 0 ) {
				zero = true;
				num |= i;
			}
			
			i <<= 1;
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		int num = 10;
		
		System.out.println(Integer.toBinaryString(nextSmallest(num)));
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toBinaryString(nextLargest(num)));
	}
}
