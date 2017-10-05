package com.gsrk.interfaces;

public class SameMethodFromTwoInterfaces implements One, Two {

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "One";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new SameMethodFromTwoInterfaces().getValue());
		
		// int[] arr = new int[5][];

	}

}
