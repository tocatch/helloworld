package com.example.demo.controller;

import com.example.demo.service.HelloSevice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wood
 * @date 2025/5/8 6:05 PM
 */
@RestController
public class Hello {

    @Resource
    private HelloSevice sevice;

    @GetMapping
    public String heelo(){
        return sevice.hello();
    }

}
