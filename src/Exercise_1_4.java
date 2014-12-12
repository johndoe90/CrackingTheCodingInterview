
public class Exercise_1_4 {

	public static void replaceSpace(char[] str, int trueLength) {
		int shiftBy = 0;
		for ( int i = 0; i < trueLength; i++ ) {
			if ( str[i] == ' ' ) 
				shiftBy += 2;
		}
				
		for ( int i = trueLength - 1; i >= 0; i-- ) {
			if ( str[i] != ' ' ) {
				str[i + shiftBy] = str[i];
			} else {
				str[i + shiftBy - 2] = '%';
				str[i + shiftBy - 1] = '2';
				str[i + shiftBy] = '0';
				shiftBy -= 2;
			}
		}
	}
	
	public static void main(String[] args) {
		char[] test = " Hallo Mr John Smith        ".toCharArray();
		replaceSpace(test, test.length - 8);
		
		System.out.println(test);
	}
}
