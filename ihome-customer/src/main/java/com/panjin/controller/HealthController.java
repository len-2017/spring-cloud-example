package com.panjin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panjin.
 * @date 2018/1/3.
 */
@RestController
public class HealthController {

    @GetMapping(value = "/health")
    public String health() {
        return "hello, customer!";
    }
}
