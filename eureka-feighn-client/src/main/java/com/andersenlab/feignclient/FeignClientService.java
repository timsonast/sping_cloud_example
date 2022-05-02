package com.andersenlab.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-client")
public interface FeignClientService {
    @RequestMapping("/service-port")
    String port();
}
