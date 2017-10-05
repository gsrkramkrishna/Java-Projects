package com.gsrk.util.concurrent;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    protected BlockingQueue queue = null;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
        	for(int i=1;i<=10;i++){
        		System.out.println("Adding to the queue:"+i);
        		queue.put(""+i);
        		Thread.sleep(1000);
        	}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
