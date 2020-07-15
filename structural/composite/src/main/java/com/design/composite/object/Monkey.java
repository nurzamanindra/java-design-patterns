package com.design.composite.object;

import com.design.composite.interfaces.Animal;
import com.design.composite.type.Type;

public class Monkey implements Animal{

	String name;
	String food;
	Type type;
	
	public Monkey(String n) {
		this.type = Type.HERBIVORE;
		this.food = "banana";
		this.name = n;
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

	public void introduce() {
		// TODO Auto-generated method stub
		System.out.println("Hallo... I'm a Monkey and my name is "+ this.name+". my type is "+ this.type + ", and I eat "+ this.food);

	}

	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Monkey and I am walking");
		
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Monkey and I am running");

		
	}

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Monkey and I am eating");

	}

}
