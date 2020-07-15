package com.design.bridge.object.device;

import com.design.bridge.interfaces.Device;

public class TV implements Device {
	private boolean on = false;

	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return on;
	}

	public void enable() {
		// TODO Auto-generated method stub
		this.on = true;

	}

	public void disable() {
		// TODO Auto-generated method stub
		this.on = false;

	}

	public void printStatus() {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------");
		System.out.println("| I'm TV.");
		System.out.println("| I'm " + (on ? "enabled" : "disabled"));
		System.out.println("------------------------------------\n");

	}

}
