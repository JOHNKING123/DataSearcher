package com.zhengcq.datasercher.controller;


import com.zhengcq.datasercher.entity.User;
import com.zhengcq.datasercher.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/test1")
    public Object test(@RequestParam("name")String name,@RequestParam("userId")Integer userId){
      // User user = userService.getById(userId);
        User user = null;
        if(user != null){
             return "hello world,"+user.getName()+",age:"+user.getAge()+"，are you ok?..";
        }
        return "hello world,"+name+"，are you ok?..";
    }
}
