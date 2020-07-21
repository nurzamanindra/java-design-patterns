package com.design.chainofresponsibility.validator;

import com.design.chainofresponsibility.Object.Human;

public class HumanValidator {
	
	public boolean validate(Human h) {
		Validator v = new HumanEmptyPropertyValidator();
		v.nextValidator(new HumanAgeValidator()).nextValidator(new HumanFirstNameValidator());
		
		return v.validate(h);
	}

}
