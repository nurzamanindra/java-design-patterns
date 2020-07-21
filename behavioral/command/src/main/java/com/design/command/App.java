package com.design.command;

import com.design.command.command.LightCommand;
import com.design.command.command.TurnOffLight;
import com.design.command.command.TurnOnLight;
import com.design.command.object.Light;

public class App 
{
    public static void main( String[] args )
    {
    	Light l = new Light();
    	
    	Remote remote = new Remote();
    	LightCommand turnOn = new TurnOnLight(l);
    	remote.setCommand(turnOn);
    	remote.buttonPress();
    	
    	LightCommand turnOff = new TurnOffLight(l);
    	remote.setCommand(turnOff);
    	remote.buttonPress();
    }
}
