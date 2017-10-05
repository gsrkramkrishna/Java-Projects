package com.gsrk.threads;
//Java Thread join method can be used to pause the current thread execution until unless the 
//specified thread is dead. There are three overloaded join functions.
public class TestThreadJoin implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThreadJoin t0 = new TestThreadJoin();
		Thread t1 = new Thread(t0);
		t1.setName("Thread-1");
		Thread t2 = new Thread(t0);
		t2.setName("Thread-2");
		Thread t3 = new Thread(t0);
		t3.setName("Thread-3");
		t1.start();
		t3.start();
		t2.start();
		try {
			t2.join();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public synchronized void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + " value:" + i);
		}
	}

}
