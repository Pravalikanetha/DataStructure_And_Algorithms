package com.dsa;

import java.util.Arrays;

public class FindLeftRightPosition {
	public static int left(int[] arr, int target) {
		int n = arr.length;
		int l=0;
		int r=n-1;
		while(l<=r) {
			int mid = l+(r-l)/2;
			if(arr[mid]>=target) {
				r=mid-1;
			}else {
				l=mid+1;
			}
		}
		if(l>=arr.length||arr[l]!=target) {
			return -1;
		}
		return l;
	}

	public static int right(int[] arr, int target) {
		int n = arr.length;
		int l=0;
		int r=n-1;
		while(l<=r) {
			int mid = l+(r-l)/2;
			if(arr[mid]>target) {
				r=mid-1;
			}else {
				l=mid+1;
			}
		}
		if(r<0||arr[r]!=target) {
			return -1;
		}
		return r;
	}

	public static int[] search(int[] arr, int target) {
		int left = left(arr, target);
		int right = right(arr, target);
		return new int[] {left,right};
	}

	public static void main(String[] args) {
		int[] arr = {5,7,7,8,8,10};
		int target = 8;
		System.out.println(left(arr, target));
		System.out.println(right(arr, target));
		int[] output = search(arr, target);
		System.out.println(Arrays.toString(output));
		
	}

}
