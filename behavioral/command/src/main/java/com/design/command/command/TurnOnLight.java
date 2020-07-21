package com.design.command.command;

import com.design.command.object.Light;

public class TurnOnLight extends LightCommand{
	
	public TurnOnLight(Light l) {
		super(l);
	}

	public void excecute() {
		this.light.turnOn();
	}

}
