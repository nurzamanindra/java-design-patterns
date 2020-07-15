package com.design.decorator.object;

import com.design.decorator.decorator.HumanDecorator;
import com.design.decorator.interfaces.Human;

public class SuperHuman extends HumanDecorator {

	public SuperHuman(Human h) {
		super(h);
	}

	public String Walk() {
		return super.Walk() + ". Because he is a super human, now he can walk 400km/s";
	}
	
	public String Run() {
		return super.Run() + ". Because he is a super human, now he can run 9000km/s";
	}
}
