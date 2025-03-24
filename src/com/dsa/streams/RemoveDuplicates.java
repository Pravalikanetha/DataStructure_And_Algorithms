package com.dsa.streams;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String s = "pravalika";
		LinkedHashSet<Character> hs = new LinkedHashSet<>();
		for(char c  : s.toCharArray()) {
			hs.add(c);
		}
		System.out.println(hs);
		
		String ans = hs.stream()
				.map(c -> String.valueOf((char) c)) 
                .collect(Collectors.joining());  
        
        System.out.println(ans);
        String s2 = "hello";
        
        Stream<Integer> stream1 = Stream.of(1,2,3,4);
        Stream<Integer> stream2 = Stream.of(5,6,7,8);
        List<Integer> list = Stream.concat(stream1, stream2).toList();
        
        System.out.println(list);
	}
}