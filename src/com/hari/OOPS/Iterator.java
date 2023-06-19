package com.hari.OOPS;

import java.util.ArrayList;

public class Iterator {
	public static void main(String[] args) {
		
		ArrayList<String> animal = new ArrayList<String>();
		animal.add("cat");
		animal.add("dog");
		animal.add("horse");
		animal.add("rat");

		for(int i=0; i<animal.size();i++) {
			System.out.println(animal.get(i));
			
		}
		 
 	}



}

 
