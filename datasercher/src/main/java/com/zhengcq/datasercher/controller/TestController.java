package com.zhengcq.datasercher.controller;


import com.zhengcq.datasercher.dao.ProductSearchDao;
import com.zhengcq.datasercher.entity.Product;
import com.zhengcq.datasercher.entity.User;
import com.zhengcq.datasercher.service.UserService;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductSearchDao productSearchDao;

    @PostMapping(value = "/test1")
    public Object test(@RequestParam("name")String name,@RequestParam("userId")Integer userId){
        User user = userService.getById(userId);
        if(user != null){
             return "hello world,"+user.getName()+",age:"+user.getAge()+"，are you ok?..";
        }
        return "hello world,"+name+"，are you ok?..";
    }

    @GetMapping("/query")
    public Object testSearch() {
        String queryString = "test";//搜索关键字
        QueryStringQueryBuilder builder = new QueryStringQueryBuilder(queryString);
        Iterable<Product> searchResult = productSearchDao.search(builder);
        Iterator<Product> iterator = searchResult.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        return true;
    }
}
