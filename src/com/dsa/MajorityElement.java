package com.dsa;

import java.util.HashMap;

public class MajorityElement {
	public static int majority(int[] arr) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		int n = arr.length;
		for(int key : hm.keySet()) {
			if (hm.get(key) > n / 2) {
                return key;
            }
        }

        return -1;
	}
	public static void main(String[] args) {
		int arr[] = {3,1,2,3,3,1};
		System.out.print(majority(arr));
	}
}
