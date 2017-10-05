package com.gsrk.overloading.examples;

public class EasyOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 9;
		char c ='a';
		long l = 999;
		int i = 55;
		go(b);
	}
	
	static void go(byte x){
		System.out.println("byte");
	}
	static void go(char x){
		System.out.println("char");
	}
	static void go(short x){
		System.out.println("short");
	}
//	static void go(int x){
//		System.out.println("int");
//	}
//	static void go(long x){
//		System.out.println("long");
//	}
//	static void go(float x){
//		System.out.println("float");
//	}
//	static void go(double x){
//		System.out.println("double");
//	}
	static void go(Long x){
		System.out.println("Long");
	}

}
