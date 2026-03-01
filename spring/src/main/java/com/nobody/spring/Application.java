package com.nobody.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// get all the inject classes to a container
		ApplicationContext context = SpringApplication.run(Application.class, args);

		Dev dev = context.getBean(Dev.class); // get necessary class to create object
		dev.build();
	}

}
