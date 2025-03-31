package com.dsa.java;

public class DemoImpl implements Demo, Demo1{

	@Override
	public void method1() {
		System.out.println("Abstract method from Demo1");
	}

	public void m1() {
		Demo.super.m1();
	}

	public void m2() {
		Demo1.super.m2();
	}
}
