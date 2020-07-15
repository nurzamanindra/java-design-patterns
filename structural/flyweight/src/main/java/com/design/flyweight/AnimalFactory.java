package com.design.flyweight;

import java.util.HashMap;

import com.design.flyweight.interfaces.Animal;
import com.design.flyweight.object.Human;

public class AnimalFactory {
	private static final HashMap humanMap = new HashMap<String, Animal>();
	
	
	public static Animal getHuman(String name) {
		Animal human = (Animal) humanMap.get(name);
		
		if(human == null) {
			human = new Human(name);
			humanMap.put(name, human);
			System.out.println("Creating animal type "+ human.getClass().getSimpleName()+" name "+ human.getName());
			
		}
		return human;
	}
}
