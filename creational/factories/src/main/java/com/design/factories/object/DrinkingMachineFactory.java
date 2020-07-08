package com.design.factories.object;

import com.design.factories.object.abst.HotDrink;
import com.design.factories.object.coffee.Coffee;
import com.design.factories.object.tea.Tea;

public class DrinkingMachineFactory {
	
	
	public HotDrink getHotDrink(String name) {
		if(name.equalsIgnoreCase("tea")) {
			return new Tea();
		}else if(name.equalsIgnoreCase("coffee")) {
			return new Coffee();
		}
		return null;
	}

}
