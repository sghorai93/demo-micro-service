package com.example.demo.micro.service.java8.functionalinterface;
/**
 * 
 * @author Sandip
 *
 */
public class MultipleLamda {

	interface InterfaceA {
		int operation(int a, int b);
	}

	interface InterfaceB {
		String sayHello(String message);
	}
	
	/*
	 * This will only call abstract method of Interface A.
	 */
	private int operateInInterfaceA(int a, int b, InterfaceA interfaceA) {
		return interfaceA.operation(a, b);
	}

	public static void main(String[] args) {
		
		/*
		 * Here declaring different lamda 
		 * function for same functional interface
		 */
		InterfaceA addInterface = (x, y) -> x + y;
		InterfaceA multiplyInterface = (x, y) -> x * y;
		
		MultipleLamda multipleLamda = new MultipleLamda();
		
		System.out.println("Calling Add version of "
				+ "InterfaceA -> " 
				+ multipleLamda.operateInInterfaceA(5, 5, addInterface));
		
		System.out.println("Calling Multiply version of "
				+ "InterfaceA -> " 
				+ multipleLamda.operateInInterfaceA(5, 5, multiplyInterface));
		
		InterfaceB interfaceB = (message) -> {
			return "Hello, " + message;
		};
		System.out.println(interfaceB.sayHello("Sandip"));
	}

}
