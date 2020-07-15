package com.design.bridge.object.remote;

import com.design.bridge.interfaces.Device;
import com.design.bridge.interfaces.Remote;
/**
 * 
 * @author nurzamanindra
 * this is a bridging class
 */
public class BasicRemote implements Remote{
	
	//bridging interface of Device interface
	private Device device;
	
	public BasicRemote(Device d) {
		this.device = d;
	}

	public void power() {
		// TODO Auto-generated method stub
		if(device.isEnabled()) {
			device.disable();
		}else {
			device.enable();
		}
		
	}

	public void printStatusDevice() {
		// TODO Auto-generated method stub
		device.printStatus();
		
	}

}
