package com.example.demo.micro.service.java8.functionalinterface;

public class ThreadFuncInterface {

	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			//Thread.currentThread().setName("DemoThread");
			
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName()
						+ " is running with priority " 
						+ Thread.currentThread().getPriority() + " ---> " +i);
			}
		};
		
		//runnable.run();

		Thread myThread1 = new Thread(runnable);
		Thread myThread2 = new Thread(runnable);
		myThread1.start();
		myThread2.start();
		
		Thread anonymousInnerClassThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed inside Anonymous Inner Class!");
				
			}
		});
		
		anonymousInnerClassThread.start();

	}

}
