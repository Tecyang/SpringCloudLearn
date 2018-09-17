package com.tecyang.sprint_boot_demo.controller;

import org.springframework.web.bind.annotation.*;
import com.tecyang.sprint_boot_demo.Model.*;

@RestController
public class HelloController {

    @RequestMapping("/Hello")
    public Object Index()
    {
        return "Hello";
    }

    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    public String hello(@RequestParam String name)
    {
        return "Hello"+name;
    }

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public User hello(@RequestHeader String name,@RequestHeader Integer age)
    {
        return new User(name,age);
    }

    @RequestMapping(value = "/hello3",method = RequestMethod.POST)
    public String hello(@RequestBody User user)
    {
        return "Hello"+user.getName()+","+user.getAge();
    }


}
