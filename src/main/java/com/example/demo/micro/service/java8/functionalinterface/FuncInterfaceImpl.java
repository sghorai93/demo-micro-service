package com.example.demo.micro.service.java8.functionalinterface;

/**
 * 
 * @author Sandip
 *
 */
public class FuncInterfaceImpl {
	
	public static void main(String[] args) {
		
		/*
		 * Able to call static method of interface without creating object.
		 * Just Like static method of class.
		 */
		FuncInterface.staticMethod1();
		FuncInterface.staticMethod2();
		
		FuncInterface funcInterface = () -> {
			/*
			 * Here goes the body of only abstract 
			 * method of functional interface 
			 * Syntax: lambda operator -> body
			 * () -> System.out.println("Zero parameter lambda");
			 * (p) -> System.out.println("One parameter: " + p);
			 * (p1, p2) -> System.out.println("Multiple parameters: " + p1 + ", " + p2);
			 */
			System.out.println("FuncInterface: Only Abstract method");
		};
		
		funcInterface.abstructMethod();
		
		/*
		 * To call the default method of interface we need to create the object.
		 */
		funcInterface.defaultMethod1();
	}

}
