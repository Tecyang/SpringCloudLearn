package com.tecyang.feignconsumer.Controller;

import com.tecyang.feignconsumer.Model.User;
import com.tecyang.feignconsumer.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/feign-consumer",method = RequestMethod.GET)
    public String helloConsumer()
    {
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2",method = RequestMethod.GET)
    public String hello1()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello()).append("\n");
        sb.append(helloService.hello("YANG")).append("\n");
        sb.append(helloService.hello("YANG",24)).append("\n");
        sb.append(helloService.hello(new User("YANG",24))).append("\n");
        return sb.toString();

    }
}
