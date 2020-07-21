package com.design.mediator;

import com.design.mediator.interfaces.ChatMediator;
import com.design.mediator.mediator.ClassRoomChat;
import com.design.mediator.mediator.LambergCharRoom;
import com.design.mediator.object.Human1;
import com.design.mediator.object.Participant;

public class App 
{
    public static void main( String[] args )
    {
    	ChatMediator cm = new ClassRoomChat();
    	Participant p1 = new Human1(cm);
    	p1.setname("hansel");
    	p1.sendMsg("Hello from hansel");
    	
    	Participant p2 = new Human1(cm);
    	p1.setname("jane");
    	p1.sendMsg("Jane is here");
    	
    	System.out.println("========================");
    	ChatMediator lcm = new LambergCharRoom();
    	
    	Participant p3 = new Human1(lcm);
    	p3.setname("anthony");
    	p3.sendMsg("Hello from anthony");
    	
    	Participant p4 = new Human1(lcm);
    	p4.setname("justin");
    	p4.sendMsg("justin is here");
    	
    	
    }
}
