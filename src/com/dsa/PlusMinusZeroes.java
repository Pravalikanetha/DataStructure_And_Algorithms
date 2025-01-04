package com.dsa;

import java.util.ArrayList;

import java.util.List;
class Result{
	public static void plusMinus(List<Integer> arr) {
		
		int natural = 0;
		int zeroes = 0;
		int minus = 0;
		for(int i=0; i<arr.size(); i++) {
			if(arr.get(i)==0) {
				zeroes++;
			}else if(arr.get(i)<0) {
				minus++;
			}else {
				natural++;
			}
		}
		double total = arr.size();
		double positiveRatio = natural/total;
		double negativeRatio = minus/total;
		double zeroRatio = zeroes/total;
		
		
        System.out.printf("%.6f\n", positiveRatio);
        System.out.printf("%.6f\n", negativeRatio);
        System.out.printf("%.6f\n", zeroRatio);
        
		System.out.println(zeroes + "," + minus + "," + natural);
		
	}
	
}
public class PlusMinusZeroes {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
        arr.add(-1);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);
        
        Result.plusMinus(arr);
	}
}
