package com.example.demo.micro.service.java8.functionalinterface;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		new ExecutorServiceDemo().startExecutorService();
	}
	
	public void startExecutorService() {
		ExecutorService taskList = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 5; i++) {
			int newI = i + 1;
			taskList.execute(() -> {
				for (int j = 0; j < newI; j++) {
					System.out.println(Thread.currentThread()
							.getName() + " #Counter ---> " + j);
				}
				
			});
			
		}
		taskList.shutdown();
	}

}
