package com.gsrk.problems;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = process(str);
		System.out.println("Count:"+count);
	}
	
	public static int process(String str) {
		int count = 0;
		boolean isPreviousDigit = false;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				if (!isPreviousDigit) {
					count++;
					isPreviousDigit = true;
				}
			} else {
				isPreviousDigit = false;
			}
		}
		return count;
	}

}
