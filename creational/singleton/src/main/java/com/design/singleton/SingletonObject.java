package com.design.singleton;


public class SingletonObject {
	private static SingletonObject instance ;
	public String value;
	
	private SingletonObject(String v) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
		this.value=v;
	}
	
	public static SingletonObject getInstance(String val) {
	
		synchronized (SingletonObject.class) {
			if (instance == null) {
				instance = new SingletonObject(val);
			}
		}
		return instance;
	}
	
	
	public void PrintMessage() {
		System.out.println("Message from object --> "+ this.value);
	}


}
