
public class Exercise_1_1 {

	public static boolean hasAllUniqueChars(String str) {
		char current;
		boolean[] chars = new boolean[128];
		
		for ( int i = 0; i < str.length(); i++ ) {
			current = str.charAt(i);
			if ( !chars[current] ) {
				chars[current] = true;
			} else {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean hasAllUniqueChars2(String str) {
		int current;
		int letters = 0;
		for ( int i = 0; i < str.length(); i++ ) {
			current = str.charAt(i) - 'a';
			if ( ((1 << current) & letters) == 0 ) {
				letters |= (1 << current);
			} else {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String str = "abcdefghzz";
		System.out.println(hasAllUniqueChars(str));
		System.out.println(hasAllUniqueChars2(str));
	}
}
