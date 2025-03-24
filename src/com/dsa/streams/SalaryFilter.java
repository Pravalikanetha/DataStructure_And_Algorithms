package com.dsa.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryFilter {
	
	public static void salary(List<Integer> list) {
		List<Integer> filteredlist = list.stream().filter(i -> i>= 40000).collect(Collectors.toList());
		System.out.println(filteredlist);
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10000,40000,50000,20000,15000);
		salary(list);
	}
}
