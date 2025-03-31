package com.dsa.java;

public class Product {
private int Pid;
private String name;
private String Description;
public Product(int pid, String name, String description) {
	super();
	Pid = pid;
	this.name = name;
	Description = description;
}
@Override
public String toString() {
	return "Product [Pid=" + Pid + ", name=" + name + ", Description=" + Description + "]";
}
public int getPid() {
	return Pid;
}
public void setPid(int pid) {
	Pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}

}
