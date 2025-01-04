package com.dsa;

public class ReturnTypekeyWord {
	public static boolean keyWord(int[] arr1, int[] arr2) {
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		int[] arr1 = {1,2,1,9};
		int[] arr2 = {1,2,5,9};
		System.out.println(keyWord(arr1, arr2));
	}

}
