package com.dsa.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListJavaClass {

	public static void main(String[] args) {
//		LinkedList<Integer> ll = new LinkedList<>();
//
//		ll.add(10);
//		ll.add(20);
//		ll.add(30);
//
//		Iterator<Integer> it = ll.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
//
//		System.out.println(ll.contains(20));
//
//		Iterator<Integer> reverse = ll.descendingIterator();
//		while (reverse.hasNext()) {
//			System.out.println(reverse.next());
//		}

		LinkedList<Integer> linkedlist = new LinkedList<>();
		ArrayList<Integer> arraylist = new ArrayList<>();

		long startTime;
		long endTime;
		long actualTime;

		for (int i = 0; i < 10000; i++) {
			linkedlist.add(i);
			arraylist.add(i);
		}

		startTime = System.nanoTime();

//		linkedlist.get(0);
//		linkedlist.get(500);
//		linkedlist.get(999);
		linkedlist.add(65, 8979);
	
		endTime = System.nanoTime();

		actualTime = endTime-startTime;

		System.out.println("linkedlist: "+ actualTime);
//		----------------------------------------------------------------------------------
		startTime = System.nanoTime();

//		arraylist.get(0);
//		arraylist.get(500);
//		arraylist.get(999);
		arraylist.add(65, 8979);
		endTime = System.nanoTime();
		
		actualTime = endTime-startTime;
		String s1 = "abc";
//		String s2 = "xyz";
		String s3 = s1.concat("s2");
		System.out.println(s3);
		System.out.println("arraylist: "+ actualTime);
	}

}





































