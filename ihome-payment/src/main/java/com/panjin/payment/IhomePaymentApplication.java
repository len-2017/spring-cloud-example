package com.panjin.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class IhomePaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(IhomePaymentApplication.class, args);
	}
}
