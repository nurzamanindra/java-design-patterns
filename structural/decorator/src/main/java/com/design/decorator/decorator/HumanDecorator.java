package com.design.decorator.decorator;

import com.design.decorator.interfaces.Human;

public abstract class HumanDecorator implements Human{
	private Human newHuman;
	
	public HumanDecorator(Human h) {
		this.newHuman = h;
	}

	public String Walk() {
		return newHuman.Walk();
	}

	public String Run() {
		return newHuman.Run();
	}

}
