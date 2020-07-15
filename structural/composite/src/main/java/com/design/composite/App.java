package com.design.composite;

import com.design.composite.interfaces.Animal;
import com.design.composite.object.Dog;
import com.design.composite.object.Monkey;


public class App 
{
    public static void main( String[] args )
    {
    	Animal dog = new Dog("Freddie") ;
    	dog.introduce();
    	dog.walk();
    	dog.run();
    	dog.eat();
    	
    	Animal monkey = new Monkey("Alex");
    	monkey.introduce();
    	monkey.walk();
    	monkey.run();
    	monkey.eat();
    	System.out.println("=================================================");
    	System.out.printf("Animal named %s and %s are different type of Animal", dog.getName(),monkey.getName());
    	System.out.println(" ");
    	System.out.printf("%s is a %s and its type is %s", dog.getName(),dog.getClass().getSimpleName().toString(), dog.getType());
    	System.out.println(" ");
    	System.out.printf("%s is a %s and its type is %s", monkey.getName(),monkey.getClass().getSimpleName().toString(),monkey.getType());

    }
}
