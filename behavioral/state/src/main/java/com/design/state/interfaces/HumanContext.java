package com.design.state.interfaces;

import com.design.state.object.Human;

public class HumanContext{

	private State state;
	
	public void setState(State s) {
		this.state = s;
	}

	public void doAction(Human h) {
		// TODO Auto-generated method stub
		this.state.doAction(h);
		
	}
}
