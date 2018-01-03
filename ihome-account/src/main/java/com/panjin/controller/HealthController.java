package com.panjin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panjin.
 * @date 2018/1/3.
 */
@RestController
@Slf4j
public class HealthController {

    @GetMapping(value = "/health")
    public String health() {
        log.info("--------------------account-health--------------------");
        return "hello, customer!";
    }
}
