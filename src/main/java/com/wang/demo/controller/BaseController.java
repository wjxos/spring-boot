package com.wang.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class BaseController {
	
	@RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello ,spring boot!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BaseController.class, args);
    }

}
