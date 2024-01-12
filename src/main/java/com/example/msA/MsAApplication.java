package com.example.msA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.example.msA")
@EnableFeignClients
public class MsAApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAApplication.class, args);
	}

}
