package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> l = new ArrayList<>();
		
		int index1=0;
		int index2=0;
		
		for (int i = 0; i < a.size() ; i++) {
			if(a.get(i)>b.get(i)) {
	    		index1++;	
			}else if(a.get(i)<b.get(i)) {
				index2++;
			}
		}
		l.add(index1);
		l.add(index2);
		return l;
	}
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		
		a.add(17);
		a.add(28);
		a.add(30);
		
		b.add(99);
		b.add(16);
		b.add(8);

		
		System.out.println(compareTriplets(a, b));
	}

}
//17 28 30
//99 16 8