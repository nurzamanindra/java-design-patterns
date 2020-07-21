package com.design.mediator.mediator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.design.mediator.interfaces.ChatMediator;
import com.design.mediator.object.Participant;

public class ClassRoomChat implements ChatMediator{
	private DateFormat dateFormat = new SimpleDateFormat("E dd-MM-yyyy hh:mm a");  
	private Date date = new Date();  
	
	public void sendMessage(Participant p, String msg) {
        System.out.print(this.getClass().getSimpleName()+"\t["+dateFormat.format(date).toString()+"]\t");    
        System.out.println(p.getName()+" gets message: "+msg);  

	}

}
