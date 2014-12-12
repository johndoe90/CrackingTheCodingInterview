
public class Exercise_1_3 {

	public static boolean isAnagram(String strA, String strB) {
		if ( strA.length() != strB.length() ) return false;
		
		int[] letters = new int[128];
		for ( int i = 0; i < strA.length(); i++ ) {
			letters[strA.charAt(i)]++;
		}
		
		for ( int i = 0; i < strB.length(); i++ ) {
			//return early
			if ( --letters[strB.charAt(i)] < 0 ) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String strA = "Hallo";
		String strB = "ollaH";
		
		System.out.println(isAnagram(strA, strB));
	}
}
