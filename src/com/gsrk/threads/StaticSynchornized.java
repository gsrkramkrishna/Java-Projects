package com.gsrk.threads;

import sun.security.util.DisabledAlgorithmConstraints;

public class StaticSynchornized implements Runnable{
	
	private static int balance=500;
	
	public static synchronized void withdraw(int amt){
		System.out.println("withdraw method called:"+Thread.currentThread().getName());
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(getBalance()>0 && getBalance()>amt){
			balance = balance-amt;
			System.out.println("Balance:"+balance);
		}
	}

	public static synchronized int getBalance(){
		System.out.println("Balance method called:"+Thread.currentThread().getName());
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return balance;
	}
	
	public synchronized void display(){
		System.out.println("Balance before:"+getBalance()+" :"+Thread.currentThread().getName());
		withdraw(200);
		System.out.println("Balance after:"+getBalance()+" :"+Thread.currentThread().getName());
		//System.out.println("diplayeddd............");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++){
			display();
		}
	}
	
	public static void main(String[] args) {
//		Thread t1 =null;
//		try {
//			Class<StaticSynchornized> c1 = (Class<StaticSynchornized>) Class.forName(StaticSynchornized.class.getName());
//			try {
//				StaticSynchornized s1 = c1.newInstance();
//				System.out.println("HashCode s1:"+s1);
//				t1 = new Thread(s1);
//				System.out.println("HashCode t1:"+t1);
//			} catch (InstantiationException | IllegalAccessException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		StaticSynchornized s2 = new StaticSynchornized();
		Thread t2 = new Thread(s2);
		System.out.println("HashCode s2:"+s2);
		System.out.println("HashCode t2:"+t2);
		t2.setName("NON_STATIC");
		t2.start();
		withdraw(200);
//		t1.setName("STATIC");
//		t1.start();
		withdraw(200);
	}
}
