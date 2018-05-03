package com.jiuqu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AnalysisResultsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnalysisResultsServiceApplication.class, args);
	}
}
