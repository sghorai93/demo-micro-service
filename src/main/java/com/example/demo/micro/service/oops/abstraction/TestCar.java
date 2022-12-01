package com.example.demo.micro.service.oops.abstraction;

public class TestCar {

	public static void main(String[] args) {
		Car car = new Honda();
		car.accelerate();
		car.stop();
		
		Car carAnonymous = new Car() {
			
			@Override
			public void stop() {
				System.out.println("Car: Break");
			}
			
			@Override
			public void accelerate() {
				System.out.println("Car: Accelerate");
			}
		};
		
		carAnonymous.accelerate();
		carAnonymous.stop();
	}

}
