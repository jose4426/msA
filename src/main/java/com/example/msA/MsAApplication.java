package com.example.msA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsAApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAApplication.class, args);
	}

}
