package com.dsa.sorting;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] array = {9,8,1,2,3,4,5,6,7};
		bubblesort(array);
		for (int i : array) {
			System.out.println(i);
		}
	}

	private static void bubblesort(int[] array) {
		for(int i=0; i<array.length-1; i++) {
			for (int j = 0; j < array.length-i-1; j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
	}
}
