package com.design.builder;

/**
 * 
 *
 */
public class App {
	public static void main(String[] args) {
		BuilderObject u1 = new BuilderObject.Builder("Jimi", "Jazz").setAddress("jalan kenangan").build();
		BuilderObject u2 = new BuilderObject.Builder("Hendry", "First").setAge(32).setPhone("0888880123").build();
		System.out.println(u1);
		System.out.println(u2);
	}
}
