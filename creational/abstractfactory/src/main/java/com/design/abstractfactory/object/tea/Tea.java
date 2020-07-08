package com.design.abstractfactory.object.tea;

import com.design.abstractfactory.interfaces.HotDrink;

public class Tea implements HotDrink{

	public void consume() {
		System.out.println("consuming your tea");
	}

}
