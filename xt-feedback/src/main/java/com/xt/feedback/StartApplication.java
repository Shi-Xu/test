package com.xt.feedback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;

import com.xt.feedback.common.listener.ApplicationContextListener;

@SpringBootApplication
@EnableCaching
@MapperScan("com.xt.feedback.dao.*")
public class StartApplication {

	public static void main(String[] args) {
		System.out.println("StartApplication");
		SpringApplication.run(StartApplication.class, args);
	}

}
