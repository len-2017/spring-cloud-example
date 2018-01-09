package com.panjin.api.fallback;

import com.panjin.api.AccountApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AccountHystrix implements AccountApi {

    @Override
    public String getAccount(String accountNo) {
        log.info("-------------------into get account method-------------------");
        return "Account Hystrix Fallback";
    }
}
