package com.dsa.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsAPI {
	public static void filters() {
		List<Integer> l = Arrays.asList(11, 921, 93, 41,51,61,71,81,91);
		List<Integer> l2 = l.stream()
				.filter(i->i>=20)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(l2);
		List<String> s = Arrays.asList("gh", "cd", "ef" , "ij","ab");
		List<String> ans = s.stream()
							.sorted()
							.collect(Collectors.toList());
		System.out.println(ans);
	}
	public static void map() {
		List<Integer> l = Arrays.asList(11, 21, 31, 41,51,61,71,81,91);
		List<Integer> l2 = l.stream().map(i->i/10).collect(Collectors.toList());
		System.out.println(l2);
	}
	public static void forEach() {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		names.stream().forEach(name -> System.out.println("Hello "+ name));
	}
	public static void distinct() {
		List<Integer> l = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
//		List<Integer> l2 = l.stream().distinct().collect(Collectors.toList());
//		System.out.println(l2);
		
		Set<Integer> set = l.stream().collect(Collectors.toSet());
		System.out.println(set);
	}
	
	public static void main(String[] args) {
//		filters();
//		map();
//		forEach();
		distinct();
	}
}
