package com.design.bridge.object.device;

import com.design.bridge.interfaces.Device;

public class Radio implements Device {
    private boolean on = false;
	
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return on;
	}

	public void enable() {
		// TODO Auto-generated method stub
		on = true;
		
	}

	public void disable() {
		// TODO Auto-generated method stub
		on = false;
	}

	
	public void printStatus() {
		// TODO Auto-generated method stub
        System.out.println("------------------------------------");
        System.out.println("| I'm radio.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("------------------------------------\n");
		
	}

}
