package com.practice;

public class App {
	
	public static void main(String[] args) {
		System.out.println("Welcome to my practice app!");
		System.out.println(printWelcome());
		
		Dog dog1 = new Dog("Honey", "Golden Retriever", 5);
		Dog dog2 = new Dog("Lily", "Pomeranian", 7);
		
		System.out.println(dog1.getName());
		System.out.println(dog2);
		System.out.println(dog2.bark());
		System.out.println(Dog.dogs);
		
		
	}
	
	public static String printWelcome() {
		return "Welcome 2!";
	}
}
