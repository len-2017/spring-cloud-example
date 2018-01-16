package com.panjin.api;

import com.panjin.api.fallback.CustomerHystrix;
import com.panjin.dto.response.CustomerRespDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author panjin.
 * @date 2018/1/16.
 */
@FeignClient(value = "ihome-customer", fallback = CustomerHystrix.class)
public interface CustomerApi {

    @RequestMapping(value = "/customer/getCustomerInfo", method = RequestMethod.GET)
    CustomerRespDTO getCustomerInfo(@RequestParam("customerId") Long customerId);
}
