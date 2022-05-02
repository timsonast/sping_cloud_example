package com.andersenlab.feignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FeignClientServiceController {
    private FeignClientService feignClientService;

    @Autowired
    public void setFeignClientService(FeignClientService feignClientService) {
        this.feignClientService = feignClientService;
    }

    @RequestMapping("/get-port")
    public String port(Model model){
        String answer = feignClientService.port();
        model.addAttribute("port",answer);
        return "service-port";
    }
}
