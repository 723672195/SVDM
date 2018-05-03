package com.jiuqu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UnitServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitServiceApplication.class, args);
	}
}
