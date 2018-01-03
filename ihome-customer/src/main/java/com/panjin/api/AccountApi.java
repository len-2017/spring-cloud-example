package com.panjin.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author panjin.
 * @date 2018/1/3.
 */
@FeignClient(value = "ihome-account")
@RequestMapping(value = "/account")
public interface AccountApi {

    @RequestMapping(value = "/getAccount", method = RequestMethod.GET)
    String getAccount(@RequestParam("accountNo") String accountNo);
}
