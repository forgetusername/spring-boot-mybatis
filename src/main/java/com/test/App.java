package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import tk.mybatis.spring.annotation.MapperScan;

@EnableTransactionManagement
@MapperScan(basePackages = "com.test.mapper")
@SpringBootApplication(scanBasePackages = "com.test.*")
public class App {
	
	public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }

}
