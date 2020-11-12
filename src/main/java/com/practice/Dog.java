package com.practice;

import java.util.ArrayList;

public class Dog {
	private String name;
	private String breed;
	private int age;
	
	static ArrayList<Dog> dogs = new ArrayList<Dog>();
	
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		
		dogs.add(this);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void setage(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Please enter valid age.");
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String bark() {
		return "Dog Barks!";
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + " Breed: " + this.breed + " Age: " + age;
	}
}
