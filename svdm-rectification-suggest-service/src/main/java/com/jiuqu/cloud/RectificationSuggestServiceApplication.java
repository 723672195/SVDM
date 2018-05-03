package com.jiuqu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RectificationSuggestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RectificationSuggestServiceApplication.class, args);
	}
}
