package com.design.mediator.object;

import com.design.mediator.interfaces.ChatMediator;

public class Human1 extends Participant{
	
	public Human1(ChatMediator cm) {
		this.mediator = cm;
	}
	
	@Override
	public void sendMsg(String msg) {
		mediator.sendMessage(this, msg);
	}

	@Override
	public void setname(String setName) {
		// TODO Auto-generated method stub		
		this.name = setName;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
