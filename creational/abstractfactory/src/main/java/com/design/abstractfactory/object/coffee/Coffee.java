package com.design.abstractfactory.object.coffee;

import com.design.abstractfactory.interfaces.HotDrink;

public class Coffee implements HotDrink{

	public void consume() {
		System.out.println("Consuming your coffee");
	}

}
