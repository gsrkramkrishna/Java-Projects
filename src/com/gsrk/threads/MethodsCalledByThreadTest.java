package com.gsrk.threads;

public class MethodsCalledByThreadTest {
	
	public static void main(String[] args) {
		MethodsCalledByThread m1 = new MethodsCalledByThread();
		//MethodsCalledByThread m2 = new MethodsCalledByThread();
		Thread t1 = new Thread(m1, "T1");
		Thread t2 = new Thread(m1, "T2");
		Thread t3 = new Thread(m1, "T3");
		Thread t4 = new Thread(m1, "T4");
		Thread t5 = new Thread(m1, "T5");
		Thread t6 = new Thread(m1, "T6");
		Thread t7 = new Thread(m1, "T7");
		Thread t8 = new Thread(m1, "T8");
		Thread t9 = new Thread(m1, "T9");
		Thread t10 = new Thread(m1, "T10");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
	}

}
