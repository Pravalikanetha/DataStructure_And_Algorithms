package com.dsa.java;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	private int empId;
	private String name;
	private String address;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "[empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}
	public Employee(int empId, String name, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	@Override
	public int compareTo(Employee o) {
		return this.empId - o.empId;
	}
	
//	@Override
//    public int compareTo(Employee other) {
//        return this.name.compareTo(other.name); // Sorting by name
//    }
	
	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
		public int compare (Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
		}
	};
}
