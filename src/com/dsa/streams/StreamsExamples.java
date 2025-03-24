package com.dsa.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsExamples {
	public static void filters() {
		List<Integer> l = Arrays.asList(70,45,10,65,20,25);
		long results = l.stream().filter(i->i>=35).count();
		System.out.println(results);
		
		List<Integer> list = l.stream()
				.map(i->i+5)
				.filter(i->i>=35)
				.toList();
		System.out.println(list);
		
		List<Integer> list1 = l.stream()
				.filter(i->i<=35)
				.map(i->i+5)
				.toList();
		System.out.println(list1);
	}
	public static void descendingOrder() {
		List<Integer> l = Arrays.asList(70,45,10,65,20,25);
		List<Integer> l2 = l.stream()
				.sorted((a,b)->(a<b)?1:(a>b)?-1:0)//can also do with string data type
				.toList();
		System.out.println(l2);
		
		List<String> s = Arrays.asList("gh", "cd", "ef" , "ij","ab");
		List<String> l3 = s.stream()
				.sorted((a,b)->-a.compareTo(b))//can also do with integer data type
				.toList();
		System.out.println(l3);
		
		List<String> l4 = s.stream()
				.sorted((a,b)->a.compareTo(b))//can also do with integer data type
				.toList();
		System.out.println(l4);
		List<Integer> ans = l2.stream()
				.sorted((a,b)->b.compareTo(a))
				.toList();
		System.out.println(ans);
	}
	public static void main(String[] args) {
//		filters();
		descendingOrder();
		
		
	}
}

