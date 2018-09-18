package com.tecyang.sprint_boot_demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import com.tecyang.sprint_boot_demo.Model.*;

import java.util.Random;

@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger("HelloService");

    @RequestMapping(value = "/Hello", method = RequestMethod.GET)
    public String hello() throws Exception
    {
        int sleepTime = new Random().nextInt(3000);
        logger.info("sleepTIme" + sleepTime);
        Thread.sleep(sleepTime);
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
