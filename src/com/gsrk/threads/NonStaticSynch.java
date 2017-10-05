package com.gsrk.threads;

public class NonStaticSynch {
private int balance=1000;
	
	public synchronized void withdraw(int amt){
		if(getBalance()>0){
			balance = balance-amt;
		}
	}

	public synchronized int getBalance(){
		return balance;
	}
}
