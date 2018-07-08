package com.xcx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.xcx.dao")
public class SchouldStart {
    
	public static void main(String[] args) {
		SpringApplication.run(SchouldStart.class, args);
	}
}
