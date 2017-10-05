package com.gsrk.threads;

public class WaitAndNotifyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaitAndNotifyThread want = new WaitAndNotifyThread();
		want.start();
		System.out.println("Before synchronise want lock:"+want.holdsLock(want));
		synchronized (want) {
			try{
				System.out.println("Calling wait..."+want.holdsLock(want));
				want.wait();
				System.out.println("After Wait lock:"+want.holdsLock(want));
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
			
		}
		System.out.println("Total is:"+want.total);
	}

}

class WaitAndNotifyThread extends Thread {
	int total;
	public void run(){
		System.out.println("Before synchronise lock:"+this.holdsLock(this));
		synchronized (this) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i=1;i<=100;i++){
				total+=i;
			}System.out.println("Before Notify lock:"+this.holdsLock(this));
			notify();
			System.out.println("Calling notify..."+this.holdsLock(this));
		}
		
	}
}
