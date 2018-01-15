package com.panjin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class PjZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PjZipkinServerApplication.class, args);
	}
}
