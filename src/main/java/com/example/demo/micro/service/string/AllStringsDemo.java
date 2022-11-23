package com.example.demo.micro.service.string;

public class AllStringsDemo {
	
	// Method 1
    // Concatenates to String
	public static void concat1(String s1) {
        s1 = s1 + "world";
    }
	
	// Method 2
    // Concatenates to StringBuilder
    public static void concat2(StringBuilder s2) {
        s2.append("world");
    }
 
    // Method 3
    // Concatenates to StringBuffer
    public static void concat3(StringBuffer s3) {
        s3.append("world");
    }
 

	public static void main(String[] args) {
		
		String s1 = "hello ";
		concat1(s1);
		System.out.println("String -> " + s1);
		
		StringBuilder s2 = new StringBuilder("hello ");
		concat2(s2);
		System.out.println("String Builder -> " + s2);
		
		StringBuffer s3 = new StringBuffer("hello ");
		concat3(s3);
		System.out.println("String Buffer -> " + s3);
		
		
		String str = "i am string";
        
        System.out.println(new StringBuilder(str).reverse());

	}

}
