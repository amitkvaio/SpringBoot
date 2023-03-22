package com.threadPool.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

@Component("SpringBootThreadPoolConfiguration")
@ConfigurationProperties(prefix="threadpool")
@EnableAsync
public class SpringBootThreadPoolConfiguration {
	
	private String debitThreadCorePoolSize;
	private String debitThreadMaxPoolSize;
	private String debitThreadQueueCapacity;
	private String debitThreadTimeout;
	
	private String creditThreadCorePoolSize;
	private String creditThreadMaxPoolSize;
	private String creditThreadQueueCapacity;
	private String creditThreadTimeout;
	
	@Bean
	public ThreadPoolTaskExecutor getDebitThreadPoolExecutor(){
		ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
		//It is the minimum number of threads that remain active at any given point of time.
		threadPoolTaskExecutor.setCorePoolSize(Integer.parseInt(debitThreadCorePoolSize));
		
		//It is the maximum number of threads that can be created. 
		threadPoolTaskExecutor.setMaxPoolSize(Integer.parseInt(debitThreadMaxPoolSize));
		
		//QueueCapacity
		threadPoolTaskExecutor.setQueueCapacity(Integer.parseInt(debitThreadQueueCapacity));
		threadPoolTaskExecutor.setKeepAliveSeconds(Integer.parseInt(debitThreadTimeout));
		threadPoolTaskExecutor.initialize();
		return threadPoolTaskExecutor;
	}
	
	@Bean
	public ThreadPoolTaskExecutor getCreditThreadPoolExecutor(){
		ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
		threadPoolTaskExecutor.setCorePoolSize(Integer.parseInt(creditThreadCorePoolSize));
		threadPoolTaskExecutor.setMaxPoolSize(Integer.parseInt(creditThreadMaxPoolSize));
		threadPoolTaskExecutor.setQueueCapacity(Integer.parseInt(creditThreadQueueCapacity));
		threadPoolTaskExecutor.setKeepAliveSeconds(Integer.parseInt(creditThreadTimeout));
		threadPoolTaskExecutor.initialize();
		return threadPoolTaskExecutor;
	}

	public String getDebitThreadCorePoolSize() {
		return debitThreadCorePoolSize;
	}

	public void setDebitThreadCorePoolSize(String debitThreadCorePoolSize) {
		this.debitThreadCorePoolSize = debitThreadCorePoolSize;
	}

	public String getDebitThreadMaxPoolSize() {
		return debitThreadMaxPoolSize;
	}

	public void setDebitThreadMaxPoolSize(String debitThreadMaxPoolSize) {
		this.debitThreadMaxPoolSize = debitThreadMaxPoolSize;
	}

	public String getDebitThreadQueueCapacity() {
		return debitThreadQueueCapacity;
	}

	public void setDebitThreadQueueCapacity(String debitThreadQueueCapacity) {
		this.debitThreadQueueCapacity = debitThreadQueueCapacity;
	}

	public String getDebitThreadTimeout() {
		return debitThreadTimeout;
	}

	public void setDebitThreadTimeout(String debitThreadTimeout) {
		this.debitThreadTimeout = debitThreadTimeout;
	}

	public String getCreditThreadCorePoolSize() {
		return creditThreadCorePoolSize;
	}

	public void setCreditThreadCorePoolSize(String creditThreadCorePoolSize) {
		this.creditThreadCorePoolSize = creditThreadCorePoolSize;
	}

	public String getCreditThreadMaxPoolSize() {
		return creditThreadMaxPoolSize;
	}

	public void setCreditThreadMaxPoolSize(String creditThreadMaxPoolSize) {
		this.creditThreadMaxPoolSize = creditThreadMaxPoolSize;
	}

	public String getCreditThreadQueueCapacity() {
		return creditThreadQueueCapacity;
	}

	public void setCreditThreadQueueCapacity(String creditThreadQueueCapacity) {
		this.creditThreadQueueCapacity = creditThreadQueueCapacity;
	}

	public String getCreditThreadTimeout() {
		return creditThreadTimeout;
	}

	public void setCreditThreadTimeout(String creditThreadTimeout) {
		this.creditThreadTimeout = creditThreadTimeout;
	}
}
/*
<dt>Keep-alive times</dt>
*
* <dd>If the pool currently has more than corePoolSize threads,
* excess threads will be terminated if they have been idle for more
* than the keepAliveTime (see {@link
* ThreadPoolExecutor#getKeepAliveTime}). This provides a means of
* reducing resource consumption when the pool is not being actively
* used. If the pool becomes more active later, new threads will be
* constructed. This parameter can also be changed dynamically
* using method {@link ThreadPoolExecutor#setKeepAliveTime}. Using
* a value of <tt>Long.MAX_VALUE</tt> {@link TimeUnit#NANOSECONDS}
* effectively disables idle threads from ever terminating prior
* to shut down.
* </dd>
*/
