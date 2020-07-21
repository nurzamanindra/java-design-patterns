package com.design.chainofresponsibility.validator;

import com.design.chainofresponsibility.Object.Human;

public abstract class Validator {
	private Validator nextValidator;
	
	public Validator nextValidator(Validator v) {
		this.nextValidator = v;
		return this.nextValidator;
	}
	
	public Validator getNextValidator() {
		return this.nextValidator;
	}
	
	public abstract boolean validate(Human h);

}
