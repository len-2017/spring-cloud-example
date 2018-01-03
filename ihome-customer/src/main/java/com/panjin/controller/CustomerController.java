package com.panjin.controller;

import com.panjin.api.AccountApi;
import com.panjin.dto.reqeust.CustomerReqDTO;
import com.panjin.dto.response.CustomerRespDTO;
import com.panjin.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author panjin.
 * @date 2018/1/3.
 */
@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    AccountApi accountApi;

    @PostMapping(value = "/openCustomer")
    public CustomerRespDTO openCustomer(@RequestBody CustomerReqDTO customerReqDTO) {
        CustomerRespDTO respDTO = new CustomerRespDTO();
        respDTO.setCustomerName(customerReqDTO.getThirdUserName());
        respDTO.setCustomerId(customerService.openCustomer(customerReqDTO));
        return respDTO;
    }

    @GetMapping(value = "/getAccount")
    public String getAccount(@RequestParam String accountNo) {
        String account = accountApi.getAccount(accountNo);
        return "hello, customer invoke account " + account;
    }
}
