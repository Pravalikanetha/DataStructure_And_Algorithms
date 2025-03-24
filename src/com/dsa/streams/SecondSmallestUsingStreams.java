package com.dsa.streams;

import java.util.Arrays;

public class SecondSmallestUsingStreams {
	public static void smallest(int[] arr) {
		int smallestElement = Arrays.stream(arr)
				.distinct()
				.sorted()
				.skip(1)
				.findFirst()
				.orElse(-1);
//				.orElseThrow(()-> new IllegalArgumentException());
		System.out.println("smallestElement : " +smallestElement);
	}
	public static void main(String[] args) {
//		int[] arr = {11,22,3,8,5,9,6,4,6};
//		int[] arr2 = {0,0,0,0,0,0,0,0,0,0,0};
		int[] arr3 = {1};
		smallest(arr3);
	}
}
