package com.example.demo.micro.service.java8.functionalinterface;
/**
 * 
 * @author Sandip
 * <br/>This interface demonstrate difference between abstract,
 * static and default method. In a @FuntionalInterface there can
 * be only single abstract method.
 *
 */
@FunctionalInterface
public interface FuncInterface {
	
	abstract void abstructMethod();
	
	default void defaultMethod1() {
		System.out.println("FuncInterface: Default method 1");
	}
	
	default void defaultMethod2() {
		System.out.println("FuncInterface: Default method 2");
	}
	
	static void staticMethod1() {
		System.out.println("FuncInterface: Static method 1");
	}
	
	static void staticMethod2() {
		System.out.println("FuncInterface: Static method 2");
	}

}
