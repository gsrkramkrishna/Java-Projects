package com.gsrk.reflection;

public class JavaSingletonTest {
	public static void main(String[] args) {
		JavaSingleton one = JavaSingleton.getInstance();
		System.out.println(one.hashCode());
		JavaSingleton two = JavaSingleton.getInstance();
		System.out.println(two.hashCode());


	}

}
