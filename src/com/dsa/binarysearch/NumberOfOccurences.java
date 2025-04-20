package com.dsa.binarysearch;

public class NumberOfOccurences {
	static int left(int[] arr, int target) {
		int l = 0;
		int r=arr.length-1;
		while(l<=r) {
			int mid=l+(r-l)/2;
			if(arr[mid] >= target) {
				r=mid-1;
			}else {
				l=mid+1;
			}
		}
		return l;
	}
	static int right(int[] arr, int target) {
		int l = 0;
		int r=arr.length-1;
		while(l<=r) {
			int mid=l+(r-l)/2;
			if(arr[mid] > target) {
				r=mid-1;
			}else {
				l=mid+1;
			}
		}
		return r;
	}
	static int countFreq(int[] arr, int target) {
		int left = left(arr, target);
		int right = right(arr,target);
		int n = arr.length;
		if(left == n|| arr[left]!=target) return 0;
		
		return right-left+1;
	}
	public static void main(String[] args) {
		int arr[] = {1, 1, 2, 2, 2, 2, 3};
		int target = 2;
		System.out.println(countFreq(arr, target));
	}
}
