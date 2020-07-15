package com.design.composite.object;

import com.design.composite.interfaces.Animal;
import com.design.composite.type.Type;

public class Dog implements Animal{
	private String name;
	private String food;
	private Type type;
	
	public Dog(String n) {
		this.name = n;
		this.type = type.OMNIVORE;
		this.food = "everythings";
	}
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public String getFood() {
		// TODO Auto-generated method stub
		return this.food;
	}

	public Type getType() {
		// TODO Auto-generated method stub
		return this.type;
	}
	
	
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Dog and I am walking");
		
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Dog and I am running");

		
	}

	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("I'm a Dog and I am eating "+ this.food);

		
	}
	public void introduce() {
		// TODO Auto-generated method stub
		System.out.println("Hallo... I'm a Dog and my name is "+ this.name+". my type is "+ this.type + ", and I eat "+ this.food);
		
	}

}
