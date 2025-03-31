package com.dsa.java;

public interface DemoInterface {
	static void d1() {
		System.out.println("I'm a Static method from DemoInterface");
	}
	
	public static void main(String[] args) {
		DemoInterface.d1();
	}
}
