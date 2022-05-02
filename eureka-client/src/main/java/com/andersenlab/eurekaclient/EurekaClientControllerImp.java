package com.andersenlab.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientControllerImp implements EurekaClientController{
    @Value("${server.port}")
    private String port;
    @Override
    public String port() {
        return port;
    }
}
