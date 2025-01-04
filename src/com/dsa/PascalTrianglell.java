package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class PascalTrianglell {
//	public static List<Integer> getRow(int rowIndex) {
//        List<Integer> l = new ArrayList<>();
//        l.add(1);
//        for(int i=1; i<=rowIndex; i++){
//            int val = l.get(i-1)*(rowIndex-i+1)/i;
//            l.add(val);
//        }
//        return l;
//    }
	public static List<Integer> getRow(int rowIndex) {
		List<Integer> l = new ArrayList<>();
		if(rowIndex == 0 ) {
			l.add(1);
			return l;
		}
		l.add(1);
		for (int i = 1; i <= rowIndex; i++) {
			long val = (long) l.get(i - 1) * (rowIndex - i + 1) / i;
	        l.add((int) val);
        }
		
		return l;
    }
	public static void main(String[] args) {
		int numRows = 30;
		System.out.println(getRow(numRows));
	}

}
