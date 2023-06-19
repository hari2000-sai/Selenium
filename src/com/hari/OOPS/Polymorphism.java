package com.hari.OOPS;

public class Polymorphism {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Animal a= new Animal();
		 a.colour();
		 
		 a= new Dog();
		 a.colour();
		 
		 a= new Cat();
		 a.colour();
	}



}

class Animal {
	public void colour() {
		System.out.println("brown");
	}
	
}
class Dog extends Animal{
	public void colour() {
		System.out.println("black");
	}
	
}
class Cat extends Animal{
	public void colour() {
		System.out.println("white");
	}
	
}
