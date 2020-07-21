package com.design.chainofresponsibility.validator;

import com.design.chainofresponsibility.Object.Human;

public class HumanFirstNameValidator extends Validator{

	@Override
	public boolean validate(Human h) {
		System.out.println("\n======================================");

		System.out.println("Validating first name length....");
		if(h.getFirstName().length() > 10) {
			System.out.println("First name can not more than 10 characters");
			return false;
		}
		System.out.println("length in a good format...");

		if(getNextValidator() != null) {
			return getNextValidator().validate(h);
		}
		return true;
	}

}
