package com.gsrk.threads.stop;

public class StopThreadByInterrupt implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;

		try {
			while (!Thread.currentThread().isInterrupted()) {
				System.out.println(i++);
				Thread.sleep(1000);
				System.out.println("Please press enter key to stop " + Thread.currentThread().getName());
			}
		} catch (InterruptedException ie) {
			System.out.println(Thread.currentThread().getName() + " ENDED");
		}

	}

}
