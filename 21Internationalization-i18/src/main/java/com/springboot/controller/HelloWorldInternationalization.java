package com.springboot.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldInternationalization {

	@Autowired
	private MessageSource messageSource;
	
	
	@GetMapping(value = "/hello-world-i18-france")
	public String helloWorldInternationalization_france(
			@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
		return messageSource.getMessage("welcome.message", null, "Default Message", Locale.FRANCE);
	}
	//http://localhost:2019/hello-world-i18-france
	
	@GetMapping(value = "/hello-world-i18-japan")
	public String helloWorldInternationalization_japan(
			@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
		return messageSource.getMessage("welcome.message", null, "Default Message", Locale.JAPAN);
	}
	//http://localhost:2019/hello-world-i18-japan
	
	/*
		Suppose we have to implements Locale in n -numbers of method – then 
			in this approach we have to take n – numbers of Local in method parameter.
			Instead of each method get the local we can re-write the logic in better way.
	*/
	
	@GetMapping(value = "/hello-world2-i18-locale")
	public String helloWorldInternationalizationBetterImp() {
		return messageSource.getMessage("welcome.message", null, "Default Message", LocaleContextHolder.getLocale());
	}
	//http://localhost:2019/hello-world-i18-locale
	
}
