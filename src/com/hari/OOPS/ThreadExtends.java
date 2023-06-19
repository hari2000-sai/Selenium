package com.hari.OOPS;

 
public class ThreadExtends extends Thread {
	public static void main(String[] args) {
		
		ThreadExtends thread = new ThreadExtends();
		
		thread.start();
		
		System.out.println("outside of thread");
		
		 
 	}
	
	public void run() {
		System.out.println("Inside of thread");

		
	}
	



}

 
