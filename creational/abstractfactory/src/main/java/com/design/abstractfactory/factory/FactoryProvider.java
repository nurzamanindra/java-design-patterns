package com.design.abstractfactory.factory;


public class FactoryProvider {
	
	public static AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("drink")) {
			return new DrinkFactory();
		}
		return null;
		
	}

}
