package com.dsa.streams;

public class StreamsExample3 {
	public static class Box {
		int width;
		int height;
		int length;
	}
	
	public static void main(String[] args) {
		Box obj = new Box();
		obj.height=2;
		obj.width=10;
		obj.length=10;
		
		int y = obj.width * obj.height * obj.length;
		System.out.println(y);
		
		int arr[] = {1,2,3,4,5};
		for (int i = 0; i < arr.length-2; ++i) {
			System.out.println("i : "+i);
			System.out.println(arr[i] + " ");
		}
		
		System.out.println(++arr[2]);
		
		if(args.length<=0) {
			System.out.println("it's empty");
		}
	}
}
