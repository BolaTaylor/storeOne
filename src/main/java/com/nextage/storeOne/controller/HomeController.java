package com.nextage.storeOne.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class HomeController {
    @Value("${spring.application.name}")
    private String appName;
    @RequestMapping("/")
    public String index() {
        System.out.printf("Application name is " + appName +" The view name is "+ getViewName());
        return getViewName();
    }

    private String getViewName() {
        return "index.html";
    }
}
