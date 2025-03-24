package com.dsa.streams.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee("Pravalika",40000);
		Employee e2 = new Employee("Charan",10000);
		Employee e3 = new Employee("Nikhil",50000);
		Employee e4 = new Employee("Akash",60000);
		Employee e5 = new Employee("John",70000);

		List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5);
		
		List<Employee> salaryMoreThen40k = list.stream().filter(i -> i.getSalary()>40000).collect(Collectors.toList());

		System.out.println(salaryMoreThen40k); 
	}   
}
