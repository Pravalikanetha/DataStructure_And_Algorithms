package com.dsa.java;

@FunctionalInterface
interface MathOperation {
	int operation(int a, int b);
}

@FunctionalInterface
interface Animal {
	void cat();
}

public class LambdaExpression {
	public static void main(String[] args) {
		MathOperation operations = (a,b) -> { return a+b; };

		System.out.println(operations.operation(4,6));
		
		Animal catSays = () -> System.out.println("cat says meow meow");
		catSays.cat();
	}
}
