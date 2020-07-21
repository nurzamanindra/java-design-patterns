package com.design.chainofresponsibility;

import com.design.chainofresponsibility.CashDispenser.CashDispenser;
import com.design.chainofresponsibility.Object.Human;
import com.design.chainofresponsibility.validator.HumanValidator;

public class App 
{
    public static void main( String[] args )
    {
    	CashDispenser dispenser = new CashDispenser(100);
//    	dispenser.linkWith(new CashDispenser(50));
//    	dispenser.linkWith(new CashDispenser(40));
//    	dispenser.linkWith(new CashDispenser(30));
//    	dispenser.linkWith(new CashDispenser(20));
//    	dispenser.linkWith(new CashDispenser(10));
//    	dispenser.linkWith(new CashDispenser(5));

//    	dispenser.linkWithReturn(new CashDispenser(50))
//    		.linkWithReturn(new CashDispenser(30))
//    			.linkWithReturn(new CashDispenser(20))
//    			.linkWithReturn(new CashDispenser(10))
//    			.linkWithReturn(new CashDispenser(5));
//    			
//
//    	int amount = 375;
//    	dispenser.dispense(amount);
    	
    	Human h = new Human();
    	h.setAge(100);
    	h.setFirstName("hansel");
    	h.setLastName("hansel");
    	
    	HumanValidator validator = new HumanValidator();
    	if(!validator.validate(h)) {
    		System.out.println("\n======================================");
    		System.out.println("Human in a wrong format");
    	}else {
    		System.out.println("\n======================================");
    		System.out.println("Human in a correct format");

    	}
    }
}
