package com.panjin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author panjin.
 * @date 2018/1/3.
 */
@RestController
@RequestMapping(value = "/account")
@Slf4j
public class AccountController {

    @RequestMapping(value = "/getAccount", method = RequestMethod.GET)
    public String getAccount(@RequestParam String accountNo) {
        log.info("----------------------------getAccount----------------------------");
        return "hello, "+ accountNo;
    }
}
