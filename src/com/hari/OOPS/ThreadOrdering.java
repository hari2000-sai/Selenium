package com.hari.OOPS;

 
public class ThreadOrdering extends Thread {
	public static void main(String[] args) {
		
		 for(int i = 0; i<11;i++) {
			 new Thread(" "+ i) {
				 public void run() {
					 System.out.println("thread "+ getName()+ " running");
				 }
			 }
			 .start();
			 
		 }
		
		 
		
	}
	



}

 
