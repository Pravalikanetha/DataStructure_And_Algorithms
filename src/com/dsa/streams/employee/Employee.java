package com.dsa.streams.employee;

public class Employee {
	String name;
	int salary;
	
	@Override
	public String toString() {
		return "Employee [name= " + name + ", salary= " + salary + "]";
	}
	
	public String getName() {
		return name;
	}
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
