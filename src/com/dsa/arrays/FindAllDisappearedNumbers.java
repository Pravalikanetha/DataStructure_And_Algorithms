package com.dsa.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllDisappearedNumbers {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		HashSet<Integer> hs = new HashSet<>();  
		for(int i : nums) {
			hs.add(i);
		}
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<nums.length; i++) {
			if(!hs.contains(i+1)) {
				list.add(i+1);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		int[] nums = {1,1};
		System.out.println(findDisappearedNumbers(nums));
	}
}
