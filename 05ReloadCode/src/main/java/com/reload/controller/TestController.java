package com.reload.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/testC")
public class TestController {
	
	@RequestMapping("/change")
	public String codeChange(){
		return "From TestController class - Reload the change without starting the server!!!";
	}
	
	@RequestMapping("/refresh")
	public String refresh(){
		return "From TestController class - Made the change as refresh mathod!!it will automatic reload the change!!!!";
	}
	
	
}
