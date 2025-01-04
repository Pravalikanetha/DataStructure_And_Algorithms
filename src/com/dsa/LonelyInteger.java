package com.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LonelyInteger {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(3);
		l.add(2);
		l.add(1);
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<l.size(); i++) {
			hm.put(l.get(i), hm.getOrDefault(l.get(i), 0)+1);
		}
		
		for(int i : hm.keySet()) {
			if(hm.get(i)==1) {
				System.out.print(i);
			}
		}
	}

}
