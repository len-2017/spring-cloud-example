package com.panjin.controller;

import com.panjin.api.CustomerApi;
import com.panjin.dto.response.CustomerRespDTO;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author panjin.
 * @date 2018/1/3.
 */
@RestController
@RequestMapping(value = "/account")
@Slf4j
public class AccountController {

    @Resource
    private CustomerApi customerApi;

    @RequestMapping(value = "/getAccount", method = RequestMethod.GET)
    public String getAccount(@RequestParam String accountNo) {
        log.info("----------------------------getAccount----------------------------");
        return "hello, "+ accountNo;
    }

    @GetMapping(value = "/getCustomerInfo")
    @ApiOperation(value = "获取用户信息")
    @ApiImplicitParam(name = "customerId", value = "用户ID", required = true, paramType = "query", dataType = "Long")
    public CustomerRespDTO getCustomerInfo(@RequestParam Long customerId) {
        log.info("----------------------------getCustomerInfo----------------------------");
        return customerApi.getCustomerInfo(customerId);
    }
}
