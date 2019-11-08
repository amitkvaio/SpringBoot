package com.springboot.first;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloWorld {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(HelloWorld.class, args);
		System.out.println("Hello World!!");
		
		String[] beanNames = ctx.getBeanDefinitionNames();
        
        //Arrays.sort(beanNames);
 
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
	}
}
