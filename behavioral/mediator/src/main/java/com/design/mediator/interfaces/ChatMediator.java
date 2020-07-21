package com.design.mediator.interfaces;

import com.design.mediator.object.Participant;

public interface ChatMediator {
	void sendMessage(Participant p, String msg);

}
