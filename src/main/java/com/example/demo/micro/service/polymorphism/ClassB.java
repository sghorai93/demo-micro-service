package com.example.demo.micro.service.polymorphism;

public class ClassB extends ClassA {
	
	private void privateMethod() {
		System.out.println("I am private method of class B");
	}
	
	public static void publicStaticMethod() {
		System.out.println("I am public static method of class B");
	}

	public static void main(String[] args) {
		ClassB classB = new ClassB();
		classB.protectedMethod();
		classB.publicMethod();
		classB.privateMethod();
		ClassB.publicStaticMethod();

	}

}
