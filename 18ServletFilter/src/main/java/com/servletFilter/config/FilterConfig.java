package com.servletFilter.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.servletFilter.filter.ServletFilter;

@Configuration
public class FilterConfig {

	@Bean
	public FilterRegistrationBean<ServletFilter> registerFilter() {
		FilterRegistrationBean<ServletFilter> registration = new FilterRegistrationBean<>();
		registration.setFilter(new ServletFilter());
		registration.addUrlPatterns("/filter"); // Filter applies only to this URL
		registration.setOrder(1); // Filter execution order if multiple filters
		return registration;
	}
}
