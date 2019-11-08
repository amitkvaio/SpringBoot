package com.springboot.server;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

@Component
public class ServerPort implements EmbeddedServletContainerCustomizer {

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		//to change the port
		container.setPort(2050);
		
		//to change the contextPath.
		container.setContextPath("/serverportChange");
	
	}
	
}
