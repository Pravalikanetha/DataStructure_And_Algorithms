package com.dsa.stack;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.push("hi");
		stack.push("boom");
		stack.push("doom");
		stack.push("skayrim");
		
//		String fav = stack.pop();
//		System.out.println(stack);
//		System.out.println(fav);
		stack.pop();
		stack.pop();
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack.search("hi"));
	}
}
