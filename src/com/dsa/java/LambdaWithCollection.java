package com.dsa.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LambdaWithCollection {
	public static List<Integer> sortedSet(Set<Integer> list){
		return list.stream().sorted() .toList();
	}
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		
//		Collections.sort(list, (i1, i2) -> (i1 > i2) ? 1 : (i1 < i2) ? -1 :0);
//		Collections.sort(list, (i1, i2) -> Integer.compare(i2, i1) );
//		System.out.println(list);
		
		
		Set<Integer> set = new HashSet<>();
		set.add(3);
		set.add(2);
		set.add(8);
		set.add(4);
		set.add(9);
		set.add(1);
		
		List<Integer> sorted = set.stream().sorted() .toList();
//		System.out.println(sorted);

//		System.out.println(set);
//
//		Map<Integer, Integer> map = new HashMap<>();
//		for(Integer i : list) {
//			map.put(i, map.getOrDefault(i, 0)+1);
//		}
//		
//		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			if( entry.getKey() == 1  || entry.getKey() == 2) {
//				System.out.println(entry.getKey() + ":" +entry.getValue());
//			}
//		}
//		list.forEach(System.out::println);
		Employee emp1 = new Employee(11, "Pravalika", "Hyd");
		Employee emp2 = new Employee(12, "Pandu", "Hyd");
		Employee emp3 = new Employee(15, "Charan", "Hyd");
		Employee emp4 = new Employee(14, "Lucky", "Hyd");
		Employee emp5 = new Employee(13, "Arya", "delhi");
		List<Employee> emp = Arrays.asList(emp1,emp2, emp3,emp4,emp5);
		
//		Collections.sort(emp, (a,b)->(a.getEmpId() < b.getEmpId()) ? -1 : (a.getEmpId() > b.getEmpId()) ? 1 : 0);
		List<Employee> empSorted = emp.stream().sorted((a,b) -> b.getName().compareTo(a.getName())).toList();
		System.out.println(empSorted);
//		Collections.sort(emp, (a,b) -> a.compareTo(b));
//		Collections.sort(emp, Employee.NameComparator);
//		Collections.sort(emp, (a,b) -> Integer.compare(a.getEmpId(), b.getEmpId()));
//		System.out.println(emp);
		
		Collections.sort(emp, (a,b) ->  a.getName().compareTo(b.getName()));
//		System.out.println(emp);
		
		
//		List<Double> d = Arrays.asList(32.2, 87.2, 21.1, 41.3, 3.3, 213.2);
//		Collections.sort(d, (a,b) -> Double.compare(a, b));
//		System.out.println(d);
		
		
		List<Float> f = Arrays.asList(1.2f,2.1f,3.1f,4.3f,0.1f,0.9f);
		Collections.sort(f, (a,b) -> Float.compare(a, b));
//		System.out.println(f);
	}
}






















