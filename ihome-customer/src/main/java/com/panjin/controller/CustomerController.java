package com.panjin.controller;

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

    @PostMapping(value = "/openCustomer")
    public CustomerRespDTO openCustomer(@RequestBody CustomerReqDTO customerReqDTO) {
        CustomerRespDTO respDTO = new CustomerRespDTO();
        respDTO.setCustomerName(customerReqDTO.getThirdUserName());
        respDTO.setCustomerId(customerService.openCustomer(customerReqDTO));
        return respDTO;
    }

}
