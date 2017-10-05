package com.gsrk.problems;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = process("You	are really funny !"
				+ "this is james");
		System.out.println(count);
	}

	public static int process(String str) {

		System.out.println(str);
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == ' ' && str.charAt(i + 1) != ' ')) {
				count++;
			}
			else if((str.charAt(i) == '\t')){
				count++;
			}
			else if((str.charAt(i) == '\n')){
				count++;
			}
		}
		return count;
	}
}
