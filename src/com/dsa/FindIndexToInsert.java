package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class FindIndexToInsert {
	public static int bs(int[] arr, int target) {
		int l =0;
		int r=arr.length-1;
		while(l<=r) {
			int mid = l+(r-1)/2;
			if (arr[mid] < target) {
				l = mid + 1; 
            } else {
            	r = mid - 1; 
            }
		}
		System.out.println("l = "+ l);
		System.out.println("r = "+r);
		return l;
	}
	public static List<Integer> reverseArray(List<Integer> a) {
		int left = 0;
	    int right = a.size() - 1;
	    while (left < right) {
	        int temp = a.get(left);
	        a.set(left, a.get(right));
	        a.set(right, temp);
	        left++;
	        right--;
	    }
	    return a;
	}
	public static void main(String[] args) {
//		int[] arr = {1,3,5,7,9};
//		int target = 0;
//		System.out.println(bs(arr,target));
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		
		System.out.println(reverseArray(a));
		
		
	}

}
