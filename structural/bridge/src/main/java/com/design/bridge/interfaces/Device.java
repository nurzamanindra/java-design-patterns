package com.design.bridge.interfaces;

public interface Device {
    
	boolean isEnabled();

    void enable();

    void disable();

    void printStatus();
}