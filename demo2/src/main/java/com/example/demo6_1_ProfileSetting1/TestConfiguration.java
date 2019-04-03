package com.example.demo6_1_ProfileSetting1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test") //profile 이름 주기
// test라는 프로파일로 실행되기 전까지는 아래의 Bean 설정 안됨.
public class TestConfiguration {
	
	@Bean
	public BookRepository bookRepository() {
		return new TestBookRepository();
	}
}
