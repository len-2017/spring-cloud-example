package com.panjin.api;

import com.panjin.api.fallback.AccountHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author panjin.
 * @date 2018/1/3.
 */
@FeignClient(value = "ihome-account", fallback = AccountHystrix.class)
public interface AccountApi {

    @RequestMapping(value = "/account/getAccount", method = RequestMethod.GET)
    String getAccount(@RequestParam("accountNo") String accountNo);
}
