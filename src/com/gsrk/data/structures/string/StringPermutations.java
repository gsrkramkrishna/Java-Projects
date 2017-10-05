package com.gsrk.data.structures.string;

import java.util.Arrays;

public class StringPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"},{"ABC","CBA"},{"abc","cbaa"},{"234","432"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = permutation2(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	}
	
	public static boolean permutation(String s,String t){
		
		return sort(s).equals(sort(t));
	}
	
	public static String sort(String s){
		char [] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	public static boolean permutation2(String s, String t) {
		if (s.length() != t.length()) return false; // Permutations must be same length
		
		int[] letters = new int[128]; // Assumption: ASCII
		for (int i = 0; i < s.length(); i++) {
			letters[s.charAt(i)]++;
		}
		  
		for (int i = 0; i < t.length(); i++) {
			letters[t.charAt(i)]--;
		    if (letters[t.charAt(i)] < 0) {
		    	return false;
		    }
		}
		  
		return true; // letters array has no negative values, and therefore no positive values either
	}

}
