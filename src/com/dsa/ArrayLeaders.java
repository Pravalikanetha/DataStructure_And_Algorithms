package com.dsa;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		int arr[] = {5, 10, 20, 40};
		int n = arr.length;
		int max = arr[n-1];
		for(int i=n-2; i>=0; i--) {
			if(arr[i]>=max) {
				al.add(arr[i]);
				max=Math.max(max, arr[i]);
			}
		}
		Collections.reverse(al);
		al.add(arr[n-1]);
		System.out.println(al);
	}

}
