package com.client.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CreateClient {
    @RequestMapping("/demo")
    public String show(){
        String url = "demo";
        return url;
    }
}
