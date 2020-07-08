package com.design.prototype.object;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	private String name;
	private Address address;
	
	public Employee(Employee other) {
		this.name = other.name;
		this.address = new Address(other.address);
	}

}
