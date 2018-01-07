package com.panjin.filters;

import com.netflix.zuul.ZuulFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RouteFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "route";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        log.info("--------------------进入RouteFilter的run方法--------------------");
        return null;
    }
}
