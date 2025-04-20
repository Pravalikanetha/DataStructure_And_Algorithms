package com.dsa.java;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bip = (p,p1) -> {
			if(p > p1) 
				return true;
			else
				return false;
		};

		System.out.println(bip.test(9, 10));
	}
}
