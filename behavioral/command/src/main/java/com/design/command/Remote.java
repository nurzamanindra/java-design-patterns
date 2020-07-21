package com.design.command;

import com.design.command.interfaces.Command;

public class Remote {
	private Command c;
	
	public void setCommand(Command c) {
		this.c = c;
	}
	
	public void buttonPress() {
		c.excecute();
	}

}
