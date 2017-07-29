package com.infotech.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.infotech.controller"})
public class SpringBootWhileLebelErrorMessageDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWhileLebelErrorMessageDemoApplication.class, args);
	}
}
