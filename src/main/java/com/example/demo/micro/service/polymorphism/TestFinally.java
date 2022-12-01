package com.example.demo.micro.service.polymorphism;

public class TestFinally {

	public static void main(String[] args) {
		try {
		System.out.println("Terminating Program");
		System.exit(0);
		} finally {
			System.out.println("I am finally block");
		}

	}

}
