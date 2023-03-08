package com.maven.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: qianli
 * @date: 2023/3/8 -- 9:20 下午
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String testHello(){
        return "hello world";
    }
}
