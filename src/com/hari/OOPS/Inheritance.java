package com.hari.OOPS;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car carobject = new Car();
		
		carobject.rev();
		
		System.out.println(carobject.getName()+" "+carobject.getModel());

	}

}

class Vechile{
	
	private String name="ford";
	
	public String getName() {
		return name;
	}
	public void rev() {
		System.out.println("hi");
	}
}

class Car extends Vechile{
	private String model="SE";
	
	public String getModel() {
		return model;
		 
	}
	
}