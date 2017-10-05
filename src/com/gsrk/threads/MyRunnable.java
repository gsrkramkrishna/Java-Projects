package com.gsrk.threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println("childs");
		}
		
	}
	
	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t1 = new Thread();
		Thread t2 = new Thread(r);
		t1.run();
		t2.run();
//		t1.start();
//		t2.start();
		for(int i=0;i<10;i++){
			System.out.println("main:"+r.toString()+" "+MyRunnable.class.toString());
		}
	}

}
