package com.gsrk.threads.stop;

public class StopThreadByBoolean implements Runnable {
	boolean coninueThread = true;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while(true){
			if(coninueThread){
				try{
					  System.out.println(i++);
                      Thread.sleep(1000);
                      System.out.println("Please press enter key to stop "
                                +Thread.currentThread().getName());
				}catch(InterruptedException ie){
					
				}
			}else{
				 System.out.println(Thread.currentThread().getName()+" ENDED");
                 break;
			}
			
		}
		
	}

}
