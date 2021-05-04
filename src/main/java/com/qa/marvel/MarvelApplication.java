package com.qa.marvel;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.qa.marvel.controller.TestController;

@SpringBootApplication
public class MarvelApplication {

	public static void main(String[] args) {
		ApplicationContext beanbag = SpringApplication.run(MarvelApplication.class, args);
		System.out.println(beanbag.getBean("greeting"));
		TestController tc = beanbag.getBean(TestController.class);
		System.out.println(tc.saysHello());

		Object byName = beanbag.getBean("greeting");
		String byType = beanbag.getBean(String.class);
		String byBoth = beanbag.getBean("greeting", String.class);

		System.out.println(byName);
		System.out.println(byType);
		System.out.println(byBoth);
		
		// by name
		System.out.println(beanbag.getBean("AppConfig"));
		// by type
		System.out.println(beanbag.getBean(LocalTime.class));
		// by both
		System.out.println(beanbag.getBean("AppConfig", LocalTime.class));
	}

	@Bean
	public String greeting() {
		return "Hello World!";
	}
	
	@Bean
	public LocalTime AppConfig() {
		return LocalTime.now();
	}

}
