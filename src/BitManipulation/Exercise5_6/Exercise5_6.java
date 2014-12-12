package BitManipulation.Exercise5_6;

public class Exercise5_6 {

	public static int swap(int num) {
		return ( ((num & 0xaaaaaaaa) >> 1) | ((num & 0x55555555) << 1) ); 
	}
	
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(swap(0b1010)));
	}
}
