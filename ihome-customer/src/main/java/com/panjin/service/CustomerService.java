package com.panjin.service;

import com.panjin.domain.Customer;
import com.panjin.dto.reqeust.CustomerReqDTO;
import com.panjin.enums.CustomerStatusEnum;
import com.panjin.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;

/**
 * @author panjin.
 * @date 2018/1/3.
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    public Long openCustomer(CustomerReqDTO customerReqDTO) {
        Customer customer = new Customer();
        customer.setCustomerName(customerReqDTO.getThirdUserName());
        customer.setCustomerId(new Random().nextLong());
        customer.setPhoneNo(customerReqDTO.getPhoneNo());
        customer.setCreatedBy("SYSTEM");
        customer.setCreatedTime(new Date());
        customer.setModifiedBy("SYSTEM");
        customer.setStatus(CustomerStatusEnum.INIT.getCode());
        customerMapper.insertSelective(customer);
        return customer.getCustomerId();
    }
}
