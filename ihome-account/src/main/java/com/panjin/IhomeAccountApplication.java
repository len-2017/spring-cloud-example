package com.panjin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.panjin.mapper"})
public class IhomeAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(IhomeAccountApplication.class, args);
	}
}
