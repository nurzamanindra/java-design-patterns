package com.design.factories;

import com.design.factories.object.DrinkingMachineFactory;
import com.design.factories.object.abst.HotDrink;



public class App 
{
    public static void main( String[] args )
    {
    	
    	DrinkingMachineFactory machineFactory = new DrinkingMachineFactory();
    	
    	HotDrink teaMachine = machineFactory.getHotDrink("tea");
    	teaMachine.consume();
    	teaMachine.setSugar(50);
    	teaMachine.printSugar();
    	
    	HotDrink coffeeMachine = machineFactory.getHotDrink("coffee");
    	coffeeMachine.consume();
    	coffeeMachine.setSugar(0);
    	coffeeMachine.printSugar();
    	
    }
}
