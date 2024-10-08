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
		return "test1";
	}
	@Bean
	public String test2(){
		return "test2";
	}
	@Bean
	public Student student(){
		return new Student(); // Student 는 전체에서 단 한번만 생성되었지만 많은곳에서 사용 <- 싱글톤 패턴
	}
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args); // Control+Alt+V
		Iterator<String> beanNamesIterator = run.getBeanFactory().getBeanNamesIterator();
		while(beanNamesIterator.hasNext()){
			String next = beanNamesIterator.next();
			//System.out.println(next);
		}
	}
}
