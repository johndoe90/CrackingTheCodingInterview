package SortingAndSearching.Exercise11_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Exercise11_2 {

	public static void swap(String[] arr, int a, int b) {
		String temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static String sortString(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		
		return new String(arr);
	}
	
	public static void sortAnagrams(String[] arr) {
		String[] sorted = new String[arr.length];
		
		int i, k;
		for ( i = 0; i < arr.length; i++ ) {
			sorted[i] = sortString(arr[i]);
		}
		
		i = 0;
		while ( i < arr.length - 2 ) {
			k = 1;
			for ( int j = i + 2; j < arr.length; j++ ) {
				if ( sorted[i].equals(sorted[j]) ) {
					swap(arr, i + k, j);
					k++;
				}
			}
			
			i += k;
		}
	}
	
	public static void sortAnagrams2(String[] arr) {
		HashMap<String, List<String>> map = new HashMap<>();
		
		String key;
		List<String> list;
		for ( String current : arr ) {
			key = sortString(current);
			if ( !map.containsKey(key) ) {
				list = new ArrayList<>();
				map.put(key, list);
			} else {
				list = map.get(key);
			}
			
			list.add(current);
		}
		
		int i = 0;
		for ( Entry<String, List<String>> entry : map.entrySet() ) {
			for ( String current : entry.getValue() ) {
				arr[i++] = current;
			}
		}
	}
	
	public static void main(String[] args) {
		String[] anagrams = new String[] {"abc", "jfk", "bca", "jfk", "abz", "cab", "abc", "kfj", "azb"};
		
		//sortAnagrams(anagrams);
		sortAnagrams2(anagrams);
		
		for ( String cur : anagrams ) {
			System.out.println(cur);
		}
	}
} 
