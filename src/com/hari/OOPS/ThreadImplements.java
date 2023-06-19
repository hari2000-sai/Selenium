package com.hari.OOPS;

 
public class ThreadImplements implements Runnable {
	public static void main(String[] args) {
		
		ThreadImplements thread = new ThreadImplements();
		
		 Thread thredobject = new Thread(thread);
		 
		 thredobject.start();
		 
		System.out.println("outside of thread");
		
		 
 	}
	
	public void run() {
		System.out.println("Inside of thread");

		
	}
	



}

 
