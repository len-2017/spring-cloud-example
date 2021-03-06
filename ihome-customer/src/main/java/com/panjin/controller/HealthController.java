package com.panjin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panjin.
 * @date 2018/1/3.
 */
@RestController
@Slf4j
public class HealthController {

    @Value("${from}")
    private String from;

    @GetMapping(value = "/health")
    public String health() {
        log.trace("--------------------trace health--------------------");
        log.debug("--------------------debug health--------------------");
        log.info("--------------------info health-------------------");
        log.warn("--------------------warn health--------------------");
        log.error("--------------------error health--------------------");
        log.info("from is {}", from);
        return "hello, customer!";
    }

    @GetMapping(value = "/customerException")
    public String customerException() {
        log.info("--------------------test exception--------------------");
        throw new RuntimeException("this is ihome-customer occur exception");
    }
}
