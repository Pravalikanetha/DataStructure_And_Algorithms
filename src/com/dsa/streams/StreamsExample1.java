package com.dsa.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamsExample1 {
	public static void sort(List<String> l) {
		Comparator<String> c = (s1,s2)->{
			int a = s1.length();
			int b = s2.length();
			
			if(a<b) return -1;
			else if(a>b) return +1;
			else return s1.compareTo(s2);
		};
		
		List<String> sortedList = l.stream().sorted(c).toList();
		System.out.println(sortedList);
	}
	public static void main(String[] args) {
		List<String> s = Arrays.asList("AA", "AAAA", "AAA" , "A","AAAAA");
		sort(s);
	}
}
