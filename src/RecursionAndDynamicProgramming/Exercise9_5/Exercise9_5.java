package RecursionAndDynamicProgramming.Exercise9_5;

import java.util.ArrayList;
import java.util.List;

public class Exercise9_5 {

	public static List<String> permutations(String str) {
		char[] letters = str.toCharArray();
		List<String> permutations = new ArrayList<>();
		
		permutations(letters, letters.length, permutations);
		
		return permutations;
	}
	
	public static void permutations(char[] letters, int howMany, List<String> permutations) {
		if ( howMany == 1 ) {
			return;
		}
		
		for ( int i = 0; i < howMany; i++ ) {
			permutations(letters, howMany - 1, permutations);
			
			if ( howMany == 2 ) {
				permutations.add(new String(letters));
			}
			
			rotate(letters, howMany);
		}
	}
	
	public static void rotate(char[] letters, int howMany) {
		int end = letters.length - 1;
		int start = letters.length - howMany;
		
		int i;
		char first = letters[start];
		for ( i = start; i < end; i++ ) {
			letters[i] = letters[i+1];
		}
		
		letters[i] = first;
	}
	
	public static void main(String[] args) {
		List<String> permutations = permutations("abc");
		
		for ( String perm : permutations ) {
			System.out.println(perm);
		}
	}
}
