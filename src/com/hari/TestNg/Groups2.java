package com.hari.TestNg;

import org.testng.annotations.Test;

public class Groups2 {
	
	
	@Test(groups={"tow"})
	public void method3() {
		
		System.out.println("i am from method 3");
	}
	
	
	@Test(groups={"tow"})
	public void method4() {
		
		System.out.println("i am from method 4");
	}

}
