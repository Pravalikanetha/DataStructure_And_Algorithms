package com.dsa.java;

import java.util.Arrays;
import java.util.List;

public class ProductListdemo {
	public static void main(String[] args) {
		Product p1 = new Product(101, "Laptop", "High-performance ");
		Product p2 = new Product(105, "Smartphone", "Latest 5G");
		Product p3 = new Product(104, "Headphones", "Wireless headphones");
		Product p4 = new Product(103, "Smartwatch", "Water-resistant");
		Product p5 = new Product(102, "Bluetooth Speaker", "long battery life");

		List<Product> list = Arrays.asList(p1,p2,p3,p4,p5);
		
//		list.sort((a,b) -> a.getPid() > b.getPid() ? 1 : a.getPid() > b.getPid() ? -1 : 0);
		list.sort((a,b) -> Integer.compare(a.getPid(), b.getPid()));
//		Collections.sort(list, (a,b)-> Integer.compare(b.getPid(), a.getPid()));
		System.out.println(list);
	}
}
