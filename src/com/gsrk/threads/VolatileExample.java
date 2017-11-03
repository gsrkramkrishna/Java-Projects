package com.gsrk.threads;

public class VolatileExample implements Runnable{
	
	private volatile int number = 0;
	
	public static void main(String[] args) {
		VolatileExample v = new VolatileExample();
		Thread t1 = new Thread(v,"t1");
		Thread t2 = new Thread(v,"t2");
		t1.start();
		t2.start();
		System.out.println("Thread Name:"+Thread.currentThread().getName()+" :"+v.number);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++){
			number++;
			System.out.println("Thread Name:"+Thread.currentThread().getName()+" :"+number);

		}

	}
	

}
