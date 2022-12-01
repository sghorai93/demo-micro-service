package com.example.demo.micro.service.design.pattern;

public class EmployeeSingleton {

	private static EmployeeSingleton singleInstance = null;
	
	private EmployeeSingleton() {};
	
	public static EmployeeSingleton getInstance() {
		if (singleInstance == null) {
			singleInstance = new EmployeeSingleton();
		}
		return singleInstance;
	}

}
