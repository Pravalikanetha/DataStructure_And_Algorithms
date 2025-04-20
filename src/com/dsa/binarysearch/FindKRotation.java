package com.dsa.binarysearch;

import java.util.Arrays;
import java.util.List;

public class FindKRotation {
	public static int findKRotation(List<Integer> arr) {
		int l = 0;
		int r = arr.size()-1;
		int ans = Integer.MAX_VALUE;
		int mini = -1;
		while(l<=r) {
			int mid = l+(r-l)/2;
			if(arr.get(l)<=arr.get(r)) {
				if(arr.get(l)<ans) {
					ans = arr.get(l);
					mini = l;
				}
				break;
			}
			if(arr.get(l)<=arr.get(mid)) {
				if(arr.get(l)<ans) {
					ans = arr.get(l);
					mini = l;
				}
				l=mid+1;
			}else {
				if(arr.get(mid)<ans) {
					ans = arr.get(mid);
					mini = mid;
				}
				r=mid-1;
			}
		}
		System.out.println(mini);
		return ans;
	}
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(39, 6, 11, 14, 18, 36, 37, 38, 39, 6, 11);
		System.out.println(findKRotation(arr));
	}
}
