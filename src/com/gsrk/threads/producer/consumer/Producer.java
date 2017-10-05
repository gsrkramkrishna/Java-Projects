package com.gsrk.threads.producer.consumer;

import java.util.List;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private final BlockingQueue<Integer> sharedQueue;
	 
    public Producer(BlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
 
    @Override
    public void run() {
        for(int i=1; i<=10; i++){
         try {
             System.out.println("Produced : " + i);
             //put/produce into sharedQueue.
             sharedQueue.put(i);
             if(i==5)
            	 Thread.sleep(10000);
         } catch (InterruptedException ex) {
             
         }
        }
    }
}
