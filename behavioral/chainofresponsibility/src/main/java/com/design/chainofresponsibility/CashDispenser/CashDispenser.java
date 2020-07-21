package com.design.chainofresponsibility.CashDispenser;

public class CashDispenser {
	private int denominator;
	private CashDispenser next;
	
	public CashDispenser(int val) {
		this.denominator = val;
	}
	
	 public CashDispenser linkWithReturn(CashDispenser next) {
	        this.next = next;
	        return next;
	    }

	public void dispense(int amount) {
		if(amount >= denominator) {
			int num = amount / denominator;
			int balance = amount % denominator;
			System.out.println(num + " * " + denominator + "$");
			if(balance != 0 ) {
				next.dispense(balance);
			}
		} else {
			next.dispense(amount);
		}
	}
}
