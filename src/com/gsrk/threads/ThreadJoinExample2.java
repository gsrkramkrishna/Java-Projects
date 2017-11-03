package com.gsrk.threads;

//Java Thread join method can be used to pause the current thread execution until unless the 
//specified thread is dead. There are three overloaded join functions.
public class ThreadJoinExample2 implements Runnable {
	public static void main(String[] args) {
		ThreadJoinExample2 t0 = new ThreadJoinExample2();
		System.out.println(Thread.currentThread().getName() + " is Started");
		Thread t1 = new Thread(t0, "t1");
		Thread t2 = new Thread(t0, "t2");

		t1.start();
		// start second thread only when first thread is dead
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.start();
		System.out.println(Thread.currentThread().getName() + " is ended");
		System.out.println("All threads are dead, exiting main thread");
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread started:::" + Thread.currentThread().getName() + " Value:" + i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread ended:::" + Thread.currentThread().getName() + " Value:" + i);
		}
	}
}
