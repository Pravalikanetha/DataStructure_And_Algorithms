package com.dsa.queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
//		Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
		
		Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
		queue.offer("B");
		queue.offer("E");
		queue.offer("A");
		queue.offer("N");
		queue.offer("Z");
		System.out.println(queue);
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		System.out.println(queue.peek());
	}
}
