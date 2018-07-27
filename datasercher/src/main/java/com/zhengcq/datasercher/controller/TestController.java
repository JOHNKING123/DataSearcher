package com.zhengcq.datasercher.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @PostMapping(value = "/test1")
    public Object test(@RequestParam("name")String name){
        return "hello world,"+name+"，are you ok?";
    }
}
