package com.andersenlab.eurekaclient;

import org.springframework.web.bind.annotation.RequestMapping;

public interface EurekaClientController {
    @RequestMapping("/service-port")
    String port();
}
