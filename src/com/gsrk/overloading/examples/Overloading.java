package com.gsrk.overloading.examples;

public class Overloading {
	
	public void m1(String s){
		System.out.println("String");
	}
	public void m1(Object obj){
		System.out.println("Object");
	}
	
	public static void main(String[] args) {
		Overloading o1 = new Overloading();
		o1.m1(null);
	}

}
