package com.design.prototype;

import com.design.prototype.object.Address;
import com.design.prototype.object.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee jimi = new Employee("Jimi", new Address("Jalan jambu", "Kota Depok", "Indonesia"));
        
        
        Employee hansel = new Employee(jimi);
        hansel.setName("hansel");
        
        System.out.println(jimi.toString());
        System.out.println(hansel.toString());

        
        
    }
}
