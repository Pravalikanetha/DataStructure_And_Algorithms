package com.dsa.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamsExample2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int max = IntStream.range(0, arr.length).reduce(Integer.MIN_VALUE, (start, i) -> Math.max(start, arr[i]));
		int totalsum = IntStream.range(0, arr.length).reduce(0, (sum, i) -> sum+arr[i]);
		System.out.println("finding max in arr : " + max);
		System.out.println("finding total sum from arr : " +totalsum);
		
		
		List<Integer> list = Arrays.asList(5,6,7,8,9,10);
		
		int ans = IntStream.range(0, list.size()).reduce(0,(start,i)-> start+list.get(i));
		System.out.println("IntStream.range : " +ans);
		
		Arrays.stream(arr).filter(number -> list.stream().anyMatch(num -> num==number)).forEach(num -> System.out.println("Arrays.stream(arr) + list.stream() : " +num));
		int addition = IntStream.range(0, arr.length).reduce((i,j)->arr[i] > arr[j] ? arr[i] : arr[j]).orElse(-1);
		System.out.println("max arr[i] > arr[j] ? arr[i] : arr[j] : "+addition);

		
		List<Integer> list2 = List.of(12,34,55,46,78,83,90);
		
		int maximum = IntStream.range(0, list2.size()).map(i -> list2.get(i)).max().orElse(-1);
		System.out.println("maximum in list2 : " +maximum);
		
		
	}
}