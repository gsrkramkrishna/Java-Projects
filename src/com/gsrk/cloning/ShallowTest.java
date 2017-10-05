package com.gsrk.cloning;

public class ShallowTest implements Cloneable{
	
	int i =10;
	int j = 20;
	
	public static void main(String[] args) throws CloneNotSupportedException{
		ShallowTest s1 = new ShallowTest();
		ShallowTest s2 = (ShallowTest) s1.clone();
		s2.i=100;
		s2.j=200;
		System.out.println(s2.i+""+s2.j);
		System.out.println(s1.i+""+s1.j);
	}

}
