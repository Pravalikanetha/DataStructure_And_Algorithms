package com.dsa.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		System.out.println(queue.isEmpty());
		
		queue.offer("karen");
		queue.offer("chad");
		queue.offer("steve");
		queue.offer("harold");
		
		if(!queue.isEmpty()) {
			System.out.println(queue.size());
		}
		
		System.out.println(queue);
		
		queue.poll();
		System.out.println(queue);
		System.out.println(queue.peek());
		
	}
}
