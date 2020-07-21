package com.design.observer.observer;

import com.design.observer.subject.Subject;

public class OctalObserver extends Observer{
	
	public OctalObserver(Subject s) {
		this.subject = s;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
	     System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) ); 
	}

}
