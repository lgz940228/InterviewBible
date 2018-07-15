package com.lgz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lgz on 2018/7/12.
 */
@RestController
public class HelloController {
    @RequestMapping("hello")
    public String hello(){
        return "hello the world";
    }
}
