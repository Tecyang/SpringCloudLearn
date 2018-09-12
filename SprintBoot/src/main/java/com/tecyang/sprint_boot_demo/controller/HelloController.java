package com.tecyang.sprint_boot_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {



    @RequestMapping("/Hello")
    public Object Index()
    {
        return "Hello";
    }
}
