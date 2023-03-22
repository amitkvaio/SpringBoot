package com.threadPool.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class SendMessageAsynchronousCall {
	
	@Async
	public void sendMessage(String mobileNo) {
		// Logic to write to send the message.
		String threadName = Thread.currentThread().getName();
		System.out.println("************SendMessageAsynchronousCall@sendMessage****" + threadName);
		sleep(20000);
		System.out.println("Called third part to send message!!!");
	}

	public void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}





















/*
Synchronous Communication
This is called as blocking way of programming.
One thread will wait until the execution finished.

Asynchronous Communication
This is called as non-blocking way of programming.
One thread will not wait until the execution finished.

Fire and Forget
This is called as non-blocking way of programming.
This we can achieve using asynchronous programming.


*/