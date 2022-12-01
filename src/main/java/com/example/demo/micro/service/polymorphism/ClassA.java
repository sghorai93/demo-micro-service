package com.example.demo.micro.service.polymorphism;

public class ClassA {

	private void privateMethod() {
		System.out.println("I am private method of class A");
	}
	
	protected void protectedMethod() {
		System.out.println("I am protected method of class A");
	}
	
	public void publicMethod() {
		System.out.println("I am public method of class A");
	}
	
	public static void publicStaticMethod() {
		System.out.println("I am public static method of class A");
	}
	
	public static void main(String[] args) {
		ClassA classA = new ClassA();
		classA.privateMethod();
		classA.protectedMethod();
		classA.publicMethod();
		ClassA.publicStaticMethod();
	}

}
