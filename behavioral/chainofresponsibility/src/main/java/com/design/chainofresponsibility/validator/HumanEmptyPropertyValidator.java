package com.design.chainofresponsibility.validator;

import com.design.chainofresponsibility.Object.Human;

public class HumanEmptyPropertyValidator extends Validator{

	@Override
	public boolean validate(Human h) {
		System.out.println("\n======================================");

		System.out.println("validating first name ...");
		if(h.getFirstName().equals("")) {
			System.out.println("first name can not be empty...");
			return false;
		}
		System.out.println("first name in a correct format...");
		
		System.out.println("validating last name ...");
		if(h.getLastName().equals("")) {
			System.out.println("last name can not be empty...");
			return false;
		}
		System.out.println("last name in a correct format...");
		
		System.out.println("validating Age ...");
		if(h.getAge() == 0) {
			System.out.println("Age can not be 0...");
			return false;
		}
		System.out.println("Age in a correct format...");
		
		if(getNextValidator() != null) {
			return getNextValidator().validate(h);
		}
		
		return true;
	}


}
