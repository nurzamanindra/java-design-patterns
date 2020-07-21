package com.design.strategy;

import com.design.strategy.algorithm.Additional;
import com.design.strategy.algorithm.Substraction;
import com.design.strategy.interfaces.Strategy;

public class App 
{
    public static void main( String[] args )
    {
    	int a = 45;
    	int b = 30;

    	Strategy add = new Additional();
    	Strategy sub = new Substraction();
    	
    	Context ctx = new Context(add);
		System.out.println("Additional --> "+ctx.excecuteStrategy(a, b));

		Context ctx2 = new Context(sub);
		System.out.println("Substraction --> "+ ctx2.excecuteStrategy(a, b));
    }
}
