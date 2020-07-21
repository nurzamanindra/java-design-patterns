package com.design.observer.observer;

import com.design.observer.subject.Subject;

public abstract class Observer {
	protected Subject subject;
	
	public abstract void update();
	
}
