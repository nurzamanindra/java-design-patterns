package com.design.flyweight;

import com.design.flyweight.interfaces.Animal;
import com.design.flyweight.object.Human;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final String humanname[] = { "Rose", "Hansel", "Armin", "Sandy", "Black Daddy" };

    public static void main( String[] args )
    {
    	Animal human = new Human("Hansel");
    	human.setAge(23);
    	human.Introduce();
    	
    	System.out.println("\n==========produce with flyweight pattern===========\n");
    	
        for(int i=0; i < 20; ++i) {
            Animal newHuman = (Animal)AnimalFactory.getHuman(getRandomName());
            newHuman.setAge(getRandomAge());
            newHuman.Introduce();
         }
    }
    
    private static String getRandomName() {
        return humanname[(int)(Math.random()*humanname.length)];
     }
    private static int getRandomAge() {
        return (int)(Math.random()*60 );
     }
}
