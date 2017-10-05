package com.gsrk.data.structures.string;

public class StringWithAllUniqueCharacters {

	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars2(word));
		}
	}
	//Time complexity is o(n), where n is the length of the string.
	//space complexity is o(n), where n is the length of the string.
	public static boolean isUniqueChars2(String str){
		if(str.length()>128){
			return false;
		}
		boolean [] charSet = new boolean[128];
		for(int i=0;i<str.length();i++){
			int val = str.charAt(i);
			int val1 = str.charAt(i);
			//System.out.println("Code is:"+val1);
			if(charSet[val]) return false;
			charSet[val]=true;
		}
		return true;
	}
	
	public static boolean isUniqueChars(String str) {
		if (str.length() > 26) { // Only 26 characters
			return false;
		}
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) return false;
			checker |= (1 << val);
		}
		return true;
	}
}
