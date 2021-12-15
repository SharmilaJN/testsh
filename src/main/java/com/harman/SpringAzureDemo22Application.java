package com.harman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication(scanBasePackages = "controller")
@ComponentScan(basePackages="com.harman")abstract
public class SpringAzureDemo22Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemo22Application.class, args);
	}

}
