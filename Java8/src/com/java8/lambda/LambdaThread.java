package com.java8.lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class LambdaThread {

	public static void main(String[] args) {
		
			try {
				ScheduledExecutorService executor= Executors.newScheduledThreadPool(1);
				Runnable task = ()-> System.out.println("Scheduling: " + System.nanoTime());

				ScheduledFuture<?> future= executor.schedule(task, 5, TimeUnit.SECONDS);
				
				TimeUnit.SECONDS.sleep(1);
				
				long remainingDelay= future.getDelay(TimeUnit.SECONDS);
				
				System.out.printf("Remaining Delay : %s",remainingDelay);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}