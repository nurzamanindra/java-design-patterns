package com.design.abstractfactory.factory;

import com.design.abstractfactory.interfaces.HotDrink;
import com.design.abstractfactory.object.coffee.Coffee;
import com.design.abstractfactory.object.tea.Tea;

public class DrinkFactory implements AbstractFactory{

	public HotDrink create(String drinkType) {
		
		if(drinkType.equalsIgnoreCase("tea")) {
			return new Tea();
		}else if (drinkType.equalsIgnoreCase("coffee")) {
			return new Coffee();
		}
		return null;
	}

}
