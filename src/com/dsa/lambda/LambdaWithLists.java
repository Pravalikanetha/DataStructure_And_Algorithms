package com.dsa.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class LambdaWithLists {
	public static void main(String[] args) {
		//list
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.forEach(nums->System.out.println(nums));
		List<String> names = Arrays.asList("chal","Aharlie", "Alice", "Bob");
		Collections.sort(names, (a, b) -> a.compareTo(b));
		names.forEach(System.out::println);
		System.out.println(names);
		
		//hash map
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("a", 2);
		hm.put("b", 1);
		hm.put("c", 3);
		System.out.println(hm);
		hm.forEach((key,name) -> System.out.println(key +":"+name+" "));
		List<String> list1 = new ArrayList<>(hm.keySet());
		Collections.sort(list1, (a,b) -> a.compareTo(b));
		
		//Arrays
		int[] nums = {1,2,3,4,5};
		
		Arrays.stream(nums).forEachOrdered(num-> {
			num = num+1;
			System.out.println(num);
			});
		for (Iterator<Integer> i = list.iterator(); i.hasNext();) {
			int type = i.next();
			System.out.println(type);
			
		}
	}
}
