package com.gsrk.threads;

public class StartAndRunOverRiding extends Thread{
	
	public void start(){
		super.start();
		System.out.println("start method");
	}
	public void run(){
		System.out.println("run method");
	}
	
	public static void main(String[] args) {
		StartAndRunOverRiding st = new StartAndRunOverRiding();
		st.run();
		System.out.println("main mehtod:"+st.toString()+" "+StartAndRunOverRiding.class.toString());
	}

}
