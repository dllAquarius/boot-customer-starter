package com.quarius.startertest.controller;

import com.quarius.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: dllAquarius
 * @Date: 2021/12/21
 * @Description:
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;
    @GetMapping("/hello")
    public String sayHello(){
        String sayHello = helloService.sayHello("张三");
        return sayHello;
    }
}
