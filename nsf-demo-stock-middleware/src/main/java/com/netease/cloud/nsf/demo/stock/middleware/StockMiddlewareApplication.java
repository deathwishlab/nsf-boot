package com.netease.cloud.nsf.demo.stock.middleware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author chenjiahan
 */
@SpringBootApplication
public class StockMiddlewareApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(StockMiddlewareApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(StockMiddlewareApplication.class);
	}
}
