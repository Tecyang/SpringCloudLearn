package com.tecyang.feignconsumer.Service;

import com.tecyang.feignconsumer.Model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

//进行服务的绑定
@FeignClient("HelloService")
public interface HelloService {
    //    进行具体的rest接口的绑定
    @RequestMapping("/Hello")
    String hello();


    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3",method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
