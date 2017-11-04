package com.gsrk.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/* Pleas install telnet if it's not installed. It's Required for test.
 * To open a telenet connection - telnet localhost 8080
 * This program not supports more than one telenet at a time.
 * Here it's single thread only responding all telnet connections.
 * if we open more than one telenet connections, this program response for only one telnet 
	and other telnent connections are blocked.
 * Single Thread Server.
*/
public class SimpleServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(8080);
		while (true) {
			Socket s = ss.accept();
			// new Thread(() -> NIO2Util.process(s));
			NIO2Util.process(s);
		}
	}

}
