package com.gsrk.threads;

public class DirectCallRunMethod implements Runnable {

	@Override
	public void run() {
		System.out.println("IS Daemon Thread:"+Thread.currentThread().isDaemon());
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
	
	public static void main(String[] args) {
		DirectCallRunMethod d = new DirectCallRunMethod();
		System.out.println(Thread.currentThread().getName() + " is Started");
		d.run();
		System.out.println(Thread.currentThread().getName() + " is ended");
	}

}
