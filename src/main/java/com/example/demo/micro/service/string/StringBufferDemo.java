package com.example.demo.micro.service.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		/*
		 * StringBuffer is mutable and thread safe.
		 * String is immutable and thread safe
		 * StringBuilder is mutable and doesn't provide thread safety.
		 * Method of StringBuffer and StringBuilder are mostly same
		 */
		StringBuffer message = new StringBuffer("Hello. I am "); 
		//By default capacity is 16
		message.append("Sandip.");
		System.out.println(message);
		
		message.insert(message.length(), " Course : Computer");
		System.out.println(message);
		
		message.replace(1, 1, "Java");
		System.out.println(message);
		
		message.delete(1, 5);
		System.out.println(message);
		
		message.reverse();
		System.out.println(message);
		
		message.reverse();
		System.out.println(message);
		
		System.out.println(message.capacity()); //(old capacity*2)+2

	}

}