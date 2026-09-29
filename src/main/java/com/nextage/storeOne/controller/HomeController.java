package com.nextage.storeOne.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class HomeController {
    @RequestMapping("/")
    public String index() {
        String viewName = getViewName();
        System.out.printf(viewName);
        return viewName;
    }

    private String getViewName() {
        return "index";
    }
}
