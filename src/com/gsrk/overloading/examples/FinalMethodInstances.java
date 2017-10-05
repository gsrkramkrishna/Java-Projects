package com.gsrk.overloading.examples;

import java.io.IOException;

public class FinalMethodInstances {
	int x = 5;
	public static void main(String[] args) {
		final FinalMethodInstances f1 = new FinalMethodInstances();
		FinalMethodInstances f2 = new FinalMethodInstances();
		FinalMethodInstances f3 = f1;
		f3 = f2;
		f1.x = 7;
		methodA(-1);
	}
	
	public void doStuff(){
		try{
			throw new IOException();
		}catch(IOException ioe){
			//throw ioe;
		}
	}
	
	private static void methodA(int num){
		assert (num>=0);
		System.out.println(num);
	}
}
