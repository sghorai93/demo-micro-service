package com.example.demo.micro.service.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		/*
		 * The map method will return the result after applying the provided function.
		 */
		List<Integer> sqrOfNumbers = numbers.stream().map(val -> val * val).collect(Collectors.toList());
		numbers.forEach(n -> System.out.print(n + " "));
		System.out.println();
		sqrOfNumbers.forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		
		List<String> names = Arrays.asList("Akash", "Shilpi", "Samriddhi");
		List<String> result = names.stream().filter(name -> name.startsWith("S")).collect(Collectors.toList());
		names.forEach(n -> System.out.print(n + " "));
		System.out.println();
		result.forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		
		List<String> unsorted = Arrays.asList("E", "C", "A", "B", "D");
		List<String> sorted = unsorted.stream().sorted().collect(Collectors.toList());
		unsorted.forEach(n -> System.out.print(n + " "));
		System.out.println();
		sorted.forEach(n -> System.out.print(n + " "));
	}

}
