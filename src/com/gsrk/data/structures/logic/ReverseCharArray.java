package com.gsrk.data.structures.logic;

import java.util.Arrays;

public class ReverseCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArr = {'a','b','e','c','d'};
		System.out.println("Before:"+Arrays.toString(charArr));
		reverse(charArr);
		System.out.println("After:"+Arrays.toString(charArr));
		int a = 20;
		int b = 30;
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a);
		System.out.println(b);		
				
	}
	
	public static void reverse(char[] ch){
		int pos = ch.length-1;
		char temp;
		for(int i=0;i<ch.length/2;i++){
//			temp = ch[i];
//			ch[i] = ch[pos];
//			ch[pos--] = temp;
			ch[i] = (char) (ch[i] + ch[pos]);
			ch[pos] = (char) (ch[i] - ch[pos]);
			ch[i] = (char) (ch[i] - ch[pos]);
			pos--;
		}
	}
}
