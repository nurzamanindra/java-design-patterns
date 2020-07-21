package com.design.strategy;

import com.design.strategy.interfaces.Strategy;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy s) {
		this.strategy = s;
	}
	
	public float excecuteStrategy(int a, int b) {
		return strategy.calculate(a, b);
	}
}
