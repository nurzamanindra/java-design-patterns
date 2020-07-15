package com.design.flyweight.object;

import com.design.flyweight.interfaces.Animal;

public class Human implements Animal {
	private String name;
	private int age;
	
	public Human(String n) {
		this.name = n;
	}
	
	
	public void setAge(int a) {
		this.age = a;
	}
	
	public void Introduce() {
		System.out.println("Halo, I am a Human, part of Animal kingdom. My name is "+this.name+" and my age is "+this.age);
	}


	public String getName() {
		return this.name;
	}

}
