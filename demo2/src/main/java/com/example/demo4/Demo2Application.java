package com.example.demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class Demo2Application {

	@Autowired
	MyService myService;
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Demo2Application.class);
		app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) ctx -> 
		ctx.registerBean(MyService.class));
		System.out.println("functional bean definition!");
		app.run(args);
	}

}
