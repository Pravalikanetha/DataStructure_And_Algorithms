package com.dsa.streams;

public class RemveElementFromArray {
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5};
		int element = 3;
		int[] arr = remove(original,element);
		for(int  i : arr) {
			System.out.println(i);
		}
	}
	public static int[] remove(int[] original,int element) {
		int[] newArray = new int[original.length-1];
		int j = 0;
		for(int i=0; i < original.length; i++) {
			if(original[i] != element) {
				 newArray[j++] = original[i];
			}
		}
		return newArray;
	}
}
