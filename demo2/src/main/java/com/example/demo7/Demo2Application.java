package com.example.demo7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
public class Demo2Application {

	
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

	@Bean
	public MessageSource messageSource() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/messages");
		MessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource = context.getBean(MessageSource.class);
		return messageSource;
	}
}
