package com.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ArrayDuplicates {

    public static ArrayList<Integer> duplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) > 1) {
                result.add(key);
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        } else {
            Collections.sort(result);
        }

        return result;
	}

	public static void main(String[] args) {
		int arr[] = {};
		System.out.print(duplicates(arr));

	}

}
