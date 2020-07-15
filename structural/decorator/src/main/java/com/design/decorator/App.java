package com.design.decorator;

import com.design.decorator.interfaces.Human;
import com.design.decorator.object.Hansel;
import com.design.decorator.object.SuperHuman;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("======Decorator design patern=======\n");
    	
    	Human hansel = new Hansel("hansel");
    	System.out.println(hansel.Walk());
    	System.out.println(hansel.Run());
    	
    	System.out.println("\n======Super Human transformation=======\n");

    	SuperHuman superHansel = new SuperHuman(hansel);
    	System.out.println(superHansel.Walk());
    	System.out.println(superHansel.Run());
    }
}
