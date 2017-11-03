package com.gsrk.threads;

import java.util.logging.Logger;

public class OddEvenExample {
	Logger logger = Logger.getAnonymousLogger();
	private boolean isOdd;
	private final int MAX = 10;
	private int count = 0;

	public static void main(String[] args) {
		final OddEvenExample o = new OddEvenExample();
		Thread odd = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				o.odd();
			}
		},"ODD");
		Thread even = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				o.even();
			}
		},"EVEN");
		odd.start();
		even.start();
		
		try {
			odd.join();
			even.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void odd() {
		synchronized (this) {
			while (count < MAX) {
				while (!isOdd) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					logger.info("Thread Name:" + Thread.currentThread().getName() + " and Value :" + count);
				}
			}
			count++;
			isOdd = false;
			notify();
		}
	}
	public void even() {
		synchronized (this) {
			while (count < MAX) {
				while (isOdd) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					logger.info("Thread Name:" + Thread.currentThread().getName() + " and Value :" + count);
				}
			}
			count++;
			isOdd = true;
			notify();
		}
	}
}
