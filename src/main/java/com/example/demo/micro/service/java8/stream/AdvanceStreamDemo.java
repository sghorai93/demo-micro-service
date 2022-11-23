package com.example.demo.micro.service.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AdvanceStreamDemo {

	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(8, 5, 1, 2, 12, 1, 5, 7, 12);
		
		Set<Integer> numSet = numList.stream().sorted().collect(Collectors.toSet());
		List<Integer> numListSqr = numList.stream().map(x -> x*x).sorted().collect(Collectors.toList());
		numSet.forEach(x -> System.out.print(x+" "));
		System.out.println();
		numListSqr.forEach(x -> System.out.print(x+" "));
		
		
		System.out.println();
		/*
		 * Reverse a String List.
		 */
		List<String> wordList = Arrays.asList("HEY", "MADAM", "I MADAM", "15951", "YAY");
		wordList.stream().map(word -> new StringBuilder()
				.append(word).reverse())
		.forEach(val -> System.out.println(val));
		
		/*
		 * All name start with a specific character.
		 */
		List<String> nameList = Arrays.asList("Sandip", "Sam", "Suresh", "Sambit", "Rai");
		
		System.out.println(nameList.stream().filter(name -> name.startsWith("Sa"))
				.collect(Collectors.toList()));
		
		System.out.println(nameList.stream().map(name -> name.toUpperCase()).collect(Collectors.toList()));
		

	}

}
