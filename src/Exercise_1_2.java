import java.util.Stack;


public class Exercise_1_2 {

	public static void reverse(char[] str) {
		int i = 0;
		Stack<Character> stack = new Stack<>();
		while ( str[i] != '\0' ) {
			stack.push(str[i++]);
		}
		
		i = 0;
		while ( !stack.isEmpty() ) {
			str[i++] = stack.pop();
		}
	}
	
	public static void reverseInPlace(char[] str) {
		int length = 0;
		while ( str[length] != '\0' ) {
			length++;
		}
		
		char temp;
		for ( int i = 0; i < length / 2; i++ ) {
			temp = str[i];
			str[i] = str[length - 1 - i];
			str[length - 1 - i] = temp;
		}
	}
	
	public static void main(String[] args) {
		char[] str = {'a', 'b', 'c', 'd', '\0'};
		
		reverse(str);
		reverseInPlace(str);
		System.out.println(str);
	}
}
