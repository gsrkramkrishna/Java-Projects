package com.gsrk.threads;

public class MethodsCalledByThread implements Runnable{
	private volatile boolean isEnable = true;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(isEnable)
			method1();
		else
			method2();
	}
	
	public synchronized void method1(){
		System.out.println("Called by M1:"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void method2(){
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Called by M2:"+Thread.currentThread().getName());
		
	}
	public void method3(){
		System.out.println("Called by M3:"+Thread.currentThread().getName());
	}
	public void method4(){
		System.out.println("Called by M4:"+Thread.currentThread().getName());
	}
	public void method5(){
		System.out.println("Called by M5:"+Thread.currentThread().getName());
	}
}
