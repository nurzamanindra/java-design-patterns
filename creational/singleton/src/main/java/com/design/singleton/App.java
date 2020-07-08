package com.design.singleton;

/**
 * 
 * @author nurzamanindra@gmail.com
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SingletonObject firstObject = SingletonObject.getInstance("first object creation");
    	SingletonObject secondObject = SingletonObject.getInstance("second object creation");

		
    	firstObject.PrintMessage();
    	secondObject.PrintMessage();
	}
}
