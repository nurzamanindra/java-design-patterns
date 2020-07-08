package com.design.builder;

public class BuilderObject {
	// All final attributes
	private final String firstName; // required
	private final String lastName; // required
	private final int age; // optional
	private final String phone; // optional
	private final String address; // optional

	private BuilderObject(Builder b) {
		this.firstName = b.firstName;
		this.lastName = b.lastName;
		this.age = b.age;
		this.phone = b.phone;
		this.address = b.address;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	 @Override
	    public String toString() {
	        return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
	    }
	

		public static class Builder {
			private final String firstName; // required
			private final String lastName; // required
			private  int age; // optional
			private  String phone; // optional
			private String address; // optional
			
			public Builder(String fn, String ln) {
				this.firstName=fn;
				this.lastName=ln;
			}
			
			public Builder setAge(int age) {
				this.age = age;
				return this;
			}
			
			public Builder setPhone(String phone) {
				this.phone = phone;
				return this;
			}
			
			public Builder setAddress(String addr) {
				this.address = addr;
				return this;
			}
			
			public BuilderObject build() {
				BuilderObject u = new BuilderObject(this);
				return u;
			}
		}

}
