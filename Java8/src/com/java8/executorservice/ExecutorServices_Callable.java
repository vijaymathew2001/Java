package com.java8.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServices_Callable {
	
	public static void main(String[] args) {
		ExecutorService executorServices= Executors.newFixedThreadPool(3);
		
		executorServices.submit(
				()->{
					System.out.println("Thread Started");
					try {
						TimeUnit.SECONDS.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Thread Ended");

				});
		executorServices.shutdown();
	}

}
