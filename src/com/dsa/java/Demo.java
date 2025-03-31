package com.dsa.java;

public interface Demo {
//	int method(int a, int b, int c);
	
//	void method1();
	
//	int length(String s);
	default void m1() {
		System.out.println("default method from Demo");
	}
	
	static void demo() {
		System.out.println("I'm a Static method from Demo");
	}
}
