package com.dsa.lambda;

interface LE{
	void Show(int i, int j);
}
class B {

	
	public void Show() {
		System.out.println("Hey its B");
		System.out.println("second valla method");
	}
	
}

public class LambdaExpression {
	public static void main(String[] args) {
		LE obj = (i, j) -> System.out.println("Hello it is lambda " + (i+j));
		obj.Show(5, 6);

		B objB = new B();
        objB.Show();
	}
}
