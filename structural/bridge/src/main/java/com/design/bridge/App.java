package com.design.bridge;

import com.design.bridge.object.device.Radio;
import com.design.bridge.object.device.TV;
import com.design.bridge.object.remote.BasicRemote;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BasicRemote remoteTV = new BasicRemote(new TV());
    	remoteTV.power();
    	remoteTV.printStatusDevice();
    	remoteTV.power();
    	remoteTV.printStatusDevice();
    	
    	
    	BasicRemote remoteRadio = new BasicRemote(new Radio());
    	
    	remoteRadio.power();
    	remoteRadio.printStatusDevice();
    	remoteRadio.power();
    	remoteRadio.printStatusDevice();
    }
    
}
