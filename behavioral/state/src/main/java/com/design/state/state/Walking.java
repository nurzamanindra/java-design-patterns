package com.design.state.state;

import com.design.state.interfaces.State;
import com.design.state.object.Human;

public class Walking implements State {

	public void doAction(Human h) {
		// TODO Auto-generated method stub
		h.Walking();
	}

}
