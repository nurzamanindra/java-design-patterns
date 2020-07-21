package com.design.mediator.object;

import com.design.mediator.interfaces.ChatMediator;

public abstract class Participant {
	 protected String name;
	 protected ChatMediator mediator;

	 public abstract void sendMsg(String msg);  
     public abstract void setname(String setName);  
     public abstract String getName();  
}
