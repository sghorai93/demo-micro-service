package com.example.demo.micro.service.java8.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @author Sandip
 *
 */
public class ArrayListFuncInterfaceExample {

	public static void main(String[] args) {
		ArrayList<Integer> arrayListOfIntegers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		/*
		 * Print all elements using lamda function.
		 */
		arrayListOfIntegers.forEach(n -> System.out.println(n));
	}

}
