package com.gsrk.net;

import java.io.IOException;
import java.net.Socket;

public class NastyChampSocket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0;i<3000;i++){
			try{
				new Socket("localhost",8080);
				System.out.println("The Socket no:"+i);
			}catch(IOException ie){
				System.err.println("Could not connect:"+ie);
			}
		}

	}

}
