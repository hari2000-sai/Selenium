package com.hari.TestNg;

import org.testng.annotations.Test;

public class Groups1 {
	
	
	@Test(groups={"one"})
	public void method1() {
		
		System.out.println("i am from method 1");
	}
	
	
	@Test(groups={"one"})
	public void method2() {
		
		System.out.println("i am from method 2");
	}

}
