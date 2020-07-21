package com.design.observer;

import com.design.observer.observer.BinaryObserver;
import com.design.observer.observer.Observer;
import com.design.observer.observer.OctalObserver;
import com.design.observer.subject.Subject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Subject subject = new Subject();
    	
        Observer binary = new BinaryObserver(subject);
        Observer octal = new OctalObserver(subject);
        subject.attach(binary);
        subject.attach(octal);
        
        System.out.println("First state change: 15");	
        subject.setState(15);
        System.out.println("Second state change: 10");	
        subject.setState(10);
    }
}
