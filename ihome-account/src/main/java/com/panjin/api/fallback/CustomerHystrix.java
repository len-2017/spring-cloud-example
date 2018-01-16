package com.panjin.api.fallback;

import com.panjin.api.CustomerApi;
import com.panjin.dto.response.CustomerRespDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author panjin.
 * @date 2018/1/16.
 */
@Component
@Slf4j
public class CustomerHystrix implements CustomerApi {

    @Override
    public CustomerRespDTO getCustomerInfo(Long customerId) {
        log.info("-------------------into get hystrix customer method-------------------");
        return null;
    }
}
