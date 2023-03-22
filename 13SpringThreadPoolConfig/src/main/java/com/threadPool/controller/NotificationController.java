package com.threadPool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
	
	@Autowired
	private SendMessageSynchronousCall messageSynchronousCall;
	
	@Autowired
	private SendMessageAsynchronousCall messageAsynchronousCall;
	
	
	@GetMapping(value="/synch")
	public String sendMessageSynchronousCall(@RequestParam String mob) {
		String threadName = Thread.currentThread().getName();
		System.out.println("************NotificationController@sendMessageSynchronousCall****" + threadName);
		messageSynchronousCall.sendMessage(mob);
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread Name::"+threadName +"::::i::"+i);
			messageSynchronousCall.sleep(2000);
		}
		return "Message send successfully!!"+threadName;
	}
	
	@GetMapping(value="/asynch")
	public String sendMessageAsynchSynchronousCall(@RequestParam String mob) {
		String threadName = Thread.currentThread().getName();
		System.out.println("************NotificationController@sendMessageAsynchSynchronousCall****" + threadName);
		messageAsynchronousCall.sendMessage(mob);
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread Name::"+threadName +"::::i::"+i);
			messageSynchronousCall.sleep(2000);
		}
		return "Message send successfully!!"+threadName;
	}
}
