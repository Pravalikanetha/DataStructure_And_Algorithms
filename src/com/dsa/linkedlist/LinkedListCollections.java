package com.dsa.linkedlist;

import java.util.LinkedList;

public class LinkedListCollections {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.push("A");
		list.push("B");
//		list.push("C");
		list.push("D");
		list.push("E");
		list.pop();
		System.out.println(list);
		System.out.println();
		list.offer("A");
		list.offer("B");
		list.offer("C");
		list.offer("D");
		list.offer("E");
		System.out.println(list);
		System.out.println();
		list.poll();
		System.out.println(list);
//		list.add(4,"z");
//		System.out.println(list.peekLast());
//		list.addLast("g");
//		list.addFirst("0");
//		System.out.println(list);
	}
}
