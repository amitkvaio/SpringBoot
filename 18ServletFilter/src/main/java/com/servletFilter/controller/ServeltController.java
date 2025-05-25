package com.servletFilter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServeltController {
	@RequestMapping(value = "/filter")
	public String filterHelloWorld() {
		System.out.println("################ Iam from filter hello world ####################");
		return "Filter Hello World";
	}
}
