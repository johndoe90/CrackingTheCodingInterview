
public class Exercise_1_8 {
	
	public static boolean hasSubstring(String strA, String strB) {
		return strA.indexOf(strB) >= 0 ? true : false;
	}
	
	public static boolean isRotation(String strA, String strB) {
		if ( strA.length() == strB.length() && strA.length() > 0 ) {
			return hasSubstring(strA + strA, strB);
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		String strA = "waterbottle";
		String strB = "erbottlewat";
		
		System.out.println(isRotation(strA, strB));
	}
}
