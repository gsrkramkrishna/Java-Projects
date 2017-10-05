package com.gsrk.threads;
//Attempting to Stop a Thread via the synchronized Keyword
public class StopThreadWithBooleanVarSync {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class StoppableThread extends Thread{
			
			private boolean stopped;
			
			public void run(){
				synchronized (this) {
					while(!stopped)
						System.out.println("running");
				}
			}
			
			synchronized void stopThread(){
				stopped = true;
				System.out.println("stopped");
			}
			
		}
		
		StoppableThread st = new StoppableThread();
		st.start();
		try{
			Thread.sleep(5000);
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		st.stopThread();

	}

}
