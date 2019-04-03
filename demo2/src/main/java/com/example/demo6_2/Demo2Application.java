package com.example.demo6_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
public class Demo2Application {

	
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

}
