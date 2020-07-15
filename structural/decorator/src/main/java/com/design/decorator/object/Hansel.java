package com.design.decorator.object;

import com.design.decorator.interfaces.Human;

public class Hansel implements Human{
	private String name;

	public Hansel(String n) {
		this.name = n;
	}
	

	public String Walk() {

		return this.name + " is a human, and he is walking now";
	}

	public String Run() {

		return this.name + " is a human, and he is Running now";

		
	}
}
