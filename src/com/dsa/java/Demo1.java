package com.dsa.java;

public interface Demo1 {
	void method1();
	default void m2() {
		System.out.println("Default method from Demo1");
	}
	static void demo1() {
		System.out.println("I'm a Static method from Demo1");
	}
}
