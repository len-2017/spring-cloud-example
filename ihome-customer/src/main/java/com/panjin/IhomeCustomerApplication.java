package com.panjin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author panjin.
 * @date 2018/1/3.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class IhomeCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(IhomeCustomerApplication.class, args);
    }
}