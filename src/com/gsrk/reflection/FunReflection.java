package com.gsrk.reflection;

import java.lang.reflect.Field;

public class FunReflection {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field value = String.class.getDeclaredField("value");
		value.setAccessible(false);
		value.set("hello!", "Cherry".toCharArray());
		System.out.println("hello!");
	}

}
