package RecursionAndDynamicProgramming.Exercise9_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise9_4 {

	public static Set<Set<Character>> subsets(Set<Character> set) {
		List<Character> chars = new ArrayList<>(set);
		Set<Set<Character>> subsets = new HashSet<>();
		subsets(chars, 0, new HashSet<>(), subsets);
		
		return subsets;
	}
	
	public static void subsets(List<Character> chars, int index, Set<Character> subset, Set<Set<Character>> subsets) {
		if ( index == chars.size() ) {
			subsets.add(new HashSet<>());
		}
		
		for ( int i = index; i < chars.size(); i++ ) {
			Set<Character> newSet = new HashSet<>(subset);
			newSet.add(chars.get(i));
			subsets.add(newSet);
			
			subsets(chars, index + 1, newSet, subsets);
		}
	}
	
	public static void main(String[] args) {
		Set<Character> chars = new HashSet<>();
		chars.add('A');
		chars.add('B');
		chars.add('C');
		//chars.add('D');
		
		Set<Set<Character>> subsets = subsets(chars);
		for ( Set<Character> set : subsets ) {
			for ( Character cur : set ) {
				System.out.print(cur + " ");
			}
			
			System.out.println("");
		}
	}
}
