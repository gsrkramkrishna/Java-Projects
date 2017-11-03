package com.gsrk.nio2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class NIO2Util {

	public static int transmogrify(int data){
		if(Character.isLetter(data)) return data ^ ' ';
		return data;
	}
	
	public static void process(Socket s){
		System.out.println("Connection From:"+s + " , Thread name:"+Thread.currentThread().getName());
		try(InputStream in=s.getInputStream();
				OutputStream out=s.getOutputStream()){
				int data;
				while((data=in.read())!=-1){
					data = NIO2Util.transmogrify(data);
					out.write(data);
				}
			}catch(IOException ie){
				System.err.println("Connection Problem -"+ie);
			}
	}
	public static void processByNewThread(Socket s){
		System.out.println("Connection From:"+s + " , Thread name:"+Thread.currentThread().getName());
		try(InputStream in=s.getInputStream();
				OutputStream out=s.getOutputStream()){
				int data;
				while((data=in.read())!=-1){
					data = NIO2Util.transmogrify(data);
					out.write(data);
				}
			}catch(IOException ie){
				System.err.println("Connection Problem -"+ie);
			}
	}
	
}
