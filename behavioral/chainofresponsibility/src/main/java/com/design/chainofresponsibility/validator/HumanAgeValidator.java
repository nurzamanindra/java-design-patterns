package com.design.chainofresponsibility.validator;

import com.design.chainofresponsibility.Object.Human;

public class HumanAgeValidator extends Validator {

	@Override
	public boolean validate(Human h) {
		System.out.println("\n======================================");

		System.out.println("validating Age more than logical value ...");
		if(h.getAge() > 100) {
			System.out.println("Age of human can not more than 100 Years old");
			return false;
		}
		System.out.println("Age in a correct range ...");

		
		if(getNextValidator() != null) {
			return getNextValidator().validate(h);
		}
		return true;
	}

}
