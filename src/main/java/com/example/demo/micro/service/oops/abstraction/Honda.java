package com.example.demo.micro.service.oops.abstraction;

public class Honda implements Car {

	@Override
	public void accelerate() {
		System.out.println("Honda: Accelerate");

	}

	@Override
	public void stop() {
		System.out.println("Honda: Break");

	}

}
