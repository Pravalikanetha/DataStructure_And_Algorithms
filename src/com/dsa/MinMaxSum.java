package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class MinMaxSum {
	public static void miniMaxSum(List<Integer> arr) {
	    int min = Integer.MAX_VALUE;
	    int max = Integer.MIN_VALUE;
	    
	    long sum=0;
	    for(int num : arr) {
	    	sum+=num;
	   
	    	if(sum<min) {
	    		min=num;
	    	}
	    	if(sum>min) {
	    		min=num;
	    	}
	    }
	    long minSum = sum-min;
	    long maxSum = sum-max;
	    
	    
	    System.out.print(minSum + " " + maxSum);
    }
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		
		arr.add(1);
		arr.add(3);
		arr.add(5);
		arr.add(7);
		arr.add(9);
		miniMaxSum(arr);
	}

}
