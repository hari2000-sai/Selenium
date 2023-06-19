package com.hari.OOPS;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	public static void main(String[] args) {
		
		ArrayList<String> animal = new ArrayList<String>();
		animal.add("cat");
		animal.add("dog");
		animal.add("horse");
		animal.add("rat");

		 Iterator<String> it = animal.iterator();
		 
		 System.out.println(it.next());
		 System.out.println(it.next());
		 System.out.println(it.next());
		 System.out.println(it.next());

		 
		 
 	}



}

 
