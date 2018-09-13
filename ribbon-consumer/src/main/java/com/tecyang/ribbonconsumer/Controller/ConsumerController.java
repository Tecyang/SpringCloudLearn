package com.tecyang.ribbonconsumer.Controller;

import com.tecyang.ribbonconsumer.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
//    @Autowired
//    RestTemplate restTemplate;

    @Autowired
    HelloService helloService;

    @RequestMapping(value="/ribbon-consumer",method = RequestMethod.GET)
    public String helloConsumer()
    {
//        return restTemplate.getForEntity("http://HELLOSERVICE/Hello", String.class).getBody();
        return helloService.helloService();
    }


}
