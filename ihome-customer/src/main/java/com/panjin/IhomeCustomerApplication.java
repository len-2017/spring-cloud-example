package com.panjin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author panjin.
 * @date 2018/1/3.
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.panjin.mapper"})
@EnableFeignClients(basePackages = {"com.panjin.api"})
public class IhomeCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(IhomeCustomerApplication.class, args);
    }
}