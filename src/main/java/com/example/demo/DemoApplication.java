package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Iterator;

@SpringBootApplication
public class DemoApplication {
	@Bean
	public String test(){
		return "asdf";
	}
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args); // Control+Alt+V
		Iterator<String> beanNamesIterator = run.getBeanFactory().getBeanNamesIterator();
		while(beanNamesIterator.hasNext()){
			String next = beanNamesIterator.next();
			System.out.println(next);
		}
	}
}
