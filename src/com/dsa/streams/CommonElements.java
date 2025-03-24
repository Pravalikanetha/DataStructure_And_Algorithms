package com.dsa.streams;

import java.util.Arrays;
import java.util.List;

public class CommonElements {
	public static void common(int[] arr1, int[] arr2) {
		List<Integer> list = Arrays.stream(arr2)
				.filter(number -> Arrays.stream(arr1).anyMatch(num -> num==number))
				.boxed()
				.toList();
		System.out.println(list);
	}
	public static void main(String[] args) {
		int[] arr1 = {5,2,8,3,1};
		int[] arr2 = {1,2,3,4,5,6,7,8};
		common(arr1, arr2);
	}
}
