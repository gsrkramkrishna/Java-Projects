package com.gsrk.threads;

public class StaticSyncAndNonStaticSync extends Thread{
	
	private static int balance=1000;
	
	public static synchronized void withdraw(int amt){
		if(getBalance()>0){
			balance = balance-amt;
		}
	}

	public static synchronized int getBalance(){
		return balance;
	}
	
private int balance1=1000;
	
	public synchronized void withdraw1(int amt){
		if(getBalance1()>0){
			balance1 = balance1-amt;
		}
	}

	public synchronized int getBalance1(){
		return balance1;
	}
	
	public static void main(String... args){
		System.out.println("a");
	}

}
