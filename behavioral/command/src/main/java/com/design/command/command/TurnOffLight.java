package com.design.command.command;

import com.design.command.object.Light;

public class TurnOffLight extends LightCommand{

	public TurnOffLight(Light l) {
		super(l);
	}
	
	public void excecute() {
		this.light.turnOff();
	}

}
