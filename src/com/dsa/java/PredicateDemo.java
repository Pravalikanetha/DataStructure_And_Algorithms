package com.dsa.java;

import java.util.function.Predicate;

public class PredicateDemo {
	public static boolean large(int num) {
		Predicate<Integer> p = a -> (a&1) == 0;
		return p.test(num);
	}
	public static void m1(Predicate<Integer> p, int[] x) {
		for(int i : x) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
		
	}
	public static void main(String[] args) {
		
		int[] x = {1,2,3,4,5,6};
//		m1(p3, x);
		m1(p -> (p&1) == 0, x);
		m1(p->{
			p++;
			return (p&1) == 0 ;
			}, x);
		
		
		
		
//		m1(p3.negate(),x);
		
//		BiPredicate<Integer,Integer> p = (a,b) -> a>b;
//		System.out.println(p.test(13, 9));
//		System.out.println(large(74));
//		Predicate<String> p1 = s -> s.length()>5;
//		boolean result = p1.test("lalala");
//		System.out.println(result);
		
//		int[] firstArray = {1,2,3,4,5,6};
//		Predicate<Integer> p2 = n -> n>1;
//		Predicate<Integer> p3 = n -> (n&1) == 0;
//		Predicate<Integer> check = p2.and(p3);
//		
//		for(int i : firstArray) {
//			if(check.test(i)) {
//				System.out.println(i);
//			}
//		}
		
		
//		Predicate<Integer> p4 = num -> num>=10;
//		System.out.println(p4.test(10));
		
//		int[] arr = {4,1,0,8,5,4,3,2};
//		Predicate<Integer> even = n -> (n&1) == 0;
//		Predicate<Integer> greater = n -> n>3;
//		Predicate<Integer> num = even.and(greater);
//		for(int i : arr) {
//			if(num.test(i)) {
//				System.out.println(i);
//			}
//		}
//		
		
	}
}
