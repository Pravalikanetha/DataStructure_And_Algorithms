package com.dsa.java;

@FunctionalInterface
interface FI1{
	void method();
}

@FunctionalInterface
interface FI2 {
	public void method2();
	default void method3() {
		System.out.println("default method");
	}
	static void method4() {
		System.out.println("static method 4");
	}
}

interface b extends FI1{
	public void method2();
}

public class FunctionalInterfaces {
	public static void main(String[] args) {
		FI1 f1 = () -> System.out.println("Hello FI1 f1");
		f1.method();
		
		FI2 f2 = () -> System.out.println("Hello FI2 f2");
		f2.method2();
		f2.method3();
		FI2.method4();
	}
}
