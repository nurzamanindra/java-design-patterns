package com.design.command.command;

import com.design.command.interfaces.Command;
import com.design.command.object.Light;

public abstract class LightCommand implements Command{
	protected Light light;
	
	protected LightCommand(Light l) {
		this.light = l;
	}
	
}
