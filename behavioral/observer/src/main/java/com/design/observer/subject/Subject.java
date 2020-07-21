package com.design.observer.subject;

import java.util.ArrayList;
import java.util.List;

import com.design.observer.observer.Observer;

public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public int getState() {
		return this.state;
	}
	
	public void setState(int s) {
		this.state = s;
		notifyObserver();
	}

	public void attach(Observer o) {
		observers.add(o);
	}
	
	private void notifyObserver() {
		// TODO Auto-generated method stub
		for (Observer o : observers) {
			o.update();
		}
	}
}
