package com.springboot.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringTomcateController {
	
	@GetMapping(value="/external")
	public String externalTomcatConfiguration(){
		String str = "External Tomcat Configuration has been done successfully!!";
		return str;
	}
	
	@GetMapping(value="/hello")
	public String sayHello(){
		String str = "Hello tomcat external!!";
		return str;
	}
}
