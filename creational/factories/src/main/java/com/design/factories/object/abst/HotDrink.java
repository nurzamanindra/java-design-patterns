package com.design.factories.object.abst;

import lombok.Setter;

@Setter
public abstract class HotDrink {
	private int sugar;
	
	public abstract void consume();
	
	
	public void printSugar() {
		System.out.println("Using "+sugar+" mg of sugar");
	}
	
}
