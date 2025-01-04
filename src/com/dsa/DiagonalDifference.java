package com.dsa;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

	public static void main(String[] args) {
		List<List<Integer>> arr = Arrays.asList(
	            Arrays.asList(11, 2, 4),
	            Arrays.asList(4, 5, 6),
	            Arrays.asList(10, 8, -12)
	        );
		int n=arr.size();
		int leftSum = 0;
		for(int i=0; i<n; i++) {
			leftSum+=arr.get(i).get(i);
		}
		
		int rightSum=0;
		int i=0;
		int j=n-1;
		while(i<n&&j<n) {
			rightSum +=arr.get(i).get(j);
			i++;
			j--;
		}
		int a = Math.abs(leftSum-rightSum);
		
//		int ans = leftSum-rightSum;
		System.out.println(a);
	}

}
