package com.example.demo7;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

	@Autowired
	MessageSource messageSource;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println(messageSource.getClass());
		System.out.println(messageSource.getMessage("greeting", new String[] {"suhyeon"}, Locale.KOREA));
		System.out.println(messageSource.getMessage("greeting", new String[] {"suhyeon"}, Locale.getDefault()));
		
	
	}
}
