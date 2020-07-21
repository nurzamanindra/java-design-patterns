package com.design.observer.observer;

import com.design.observer.subject.Subject;

public class BinaryObserver extends Observer{

	public BinaryObserver(Subject s) {
		this.subject = s;
	}

	@Override
	public void update() {
	      System.out.println( "Binary String: " + Integer.toBinaryString( this.subject.getState() ) ); 
	}

}
