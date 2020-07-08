package com.design.prototype.object;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {

	private String streetAddress, city, country;
	
	public Address(Address other) {
		this(other.streetAddress, other.city, other.country);
	}
}
