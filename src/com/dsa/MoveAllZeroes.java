package com.dsa;

public class MoveAllZeroes {
	static void swap(int[] arr, int i , int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]= temp;
	}
    static void pushZerosToEnd(int[] arr) {
        int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0 && arr[j]==0) {
				swap(arr, i, j);
			}
			if(arr[j]!=0) {
				j++;
			}
		}
    }

	public static void main(String[] args) {
		int[] arr = {1};
        int n=arr.length;

        pushZerosToEnd(arr);
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]);
		}
    }

}
