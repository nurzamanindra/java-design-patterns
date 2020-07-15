package com.design.composite.interfaces;

import com.design.composite.type.Type;

public interface Animal {

	String getName();
	String getFood();
	Type getType();
	
	void introduce();
	void walk();
	void run();
	void eat();
}
