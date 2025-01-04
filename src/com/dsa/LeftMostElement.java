package com.dsa;

public class LeftMostElement {
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
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,4,5};
		int target = 2;	
		System.out.println("left most: "+left(arr,target));
		System.out.println("right most: "+right(arr,target));
	}
}


























