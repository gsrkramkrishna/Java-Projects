package com.gsrk.threads;

//Java Thread join method can be used to pause the current thread execution until unless the 
//specified thread is dead. There are three overloaded join functions.
public class ThreadJoinExample implements Runnable {
	public static void main(String[] args) {
		ThreadJoinExample t0 = new ThreadJoinExample();
		System.out.println(Thread.currentThread().getName() + " is Started");
		Thread t1 = new Thread(t0, "t1");
		Thread t2 = new Thread(t0, "t2");
		Thread t3 = new Thread(t0, "t3");

		t1.start();

		// start second thread after waiting for 2 seconds or if it's dead
		try {
			t1.join(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.start();

		// start third thread only when first thread is dead
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t3.start();

		// let all threads finish execution before finishing main thread
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " is ended");
		System.out.println("All threads are dead, exiting main thread");
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread started:::" + Thread.currentThread().getName()+" Value:"+i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread ended:::" + Thread.currentThread().getName()+" Value:"+i);
		}
	}
}
