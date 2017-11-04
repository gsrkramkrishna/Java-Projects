package com.gsrk.net;
/* Pleas install telnet if it's not installed. It's Required for test.
 * To open a telenet connection - telnet localhost 8080
 * This program supports more than one telenet at a time.
 * Each telnet/request connection is handled by new thread.
 * It's a multi threaded server
*/
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleThreadServer {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(8080);
		while(true){
			final Socket s = ss.accept();
			System.out.println("Before Creating Thread name:"+Thread.currentThread().getName());
			Thread t = new Thread() {
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("Thread created name:"+Thread.currentThread().getName());
					NIO2Util.process(s);
				}
			};
			t.start();
			// Java 8
			//new Thread(() -> NIO2Util.process(s));
			
		}
	}

}
