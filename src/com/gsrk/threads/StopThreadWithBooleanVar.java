package com.gsrk.threads;

//Attempting to Stop a Thread with boolean variable i.e stopped

//You should observe a sequence of running messages.
//When you run this application on a single-processor/single-core machine, you’ll
//probably observe the application stopping. You might not see this stoppage on a
//multiprocessor machine or a uniprocessor machine with multiple cores where each
//processor or core probably has its own cache with its own copy of stopped. When one
//thread modifies its copy of this field, the other thread’s copy of stopped isn’t changed.

public class StopThreadWithBooleanVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class StoppableThread extends Thread{
			
			private boolean stopped;
			
			public void run(){
				while(!stopped)
					System.out.println("running");
			}
			
			void stopThread(){
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
