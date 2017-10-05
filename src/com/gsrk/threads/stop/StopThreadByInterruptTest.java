package com.gsrk.threads.stop;

import java.io.IOException;

public class StopThreadByInterruptTest {

	public static void main(String[] args) {
		StopThreadByInterrupt st = new StopThreadByInterrupt();
		Thread t = new Thread(st, "Thread-0");
		t.start();
		System.out.println(Thread.currentThread().getName()
                +" thread waiting for user to press enter");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       t.interrupt();

       System.out.println(Thread.currentThread().getName()+" thread ENDED");
	}
}

