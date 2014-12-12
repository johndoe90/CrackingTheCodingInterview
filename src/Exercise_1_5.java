
public class Exercise_1_5 {

	public static String compressString(String str) {
		StringBuffer result = new StringBuffer();
		
		/*int times, i = 0;
		char current = '\0';
		while ( i < str.length() ) {
			current = str.charAt(i++);
			result.append(current);
				
			times = 1;
			while ( i < str.length() && str.charAt(i) == current ) {
				times++;
				i++;
			}
				
			result.append(times);
		}*/
		
		int count = 1;
		char cur = str.charAt(0);
		for ( int i = 1; i < str.length(); i++ ) {
			if ( str.charAt(i) == cur ) {
				count++;
			} else {
				result.append(cur);
				result.append(count);
				count = 1;
				cur = str.charAt(i);
			}
		}
		
		result.append(cur);
		result.append(count);
		
		return result.length() < str.length() ? result.toString() : str;
	}
	
	public static void main(String[] args) {
		String test = "aabcccaaddddddd";
		System.out.println(compressString(test));
	}
}
