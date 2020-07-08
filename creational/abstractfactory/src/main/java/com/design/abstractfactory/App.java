package com.design.abstractfactory;

import com.design.abstractfactory.factory.AbstractFactory;
import com.design.abstractfactory.factory.FactoryProvider;
import com.design.abstractfactory.interfaces.HotDrink;

public class App 
{
    public static void main( String[] args )
    {
		AbstractFactory drinkFactory = FactoryProvider.getFactory("drink");
		
        HotDrink tea = drinkFactory.create("tea");
        tea.consume();
        
        HotDrink coffee = drinkFactory.create("coffee");
        coffee.consume();
       
    	
    }
}
