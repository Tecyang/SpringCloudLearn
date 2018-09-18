package com.tecyang.feignconsumer.Service.Fallback;

import com.tecyang.feignconsumer.Model.User;
import com.tecyang.feignconsumer.Service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceFallback implements HelloService {

    @Override
    public String hello() {
        return "hello Service Error";
    }

    @Override
    public String hello(String name) {
        return "hello Service Error,param 'name' is :" + name;
    }

    @Override
    public User hello(String name, Integer age) {
        return new User("未知", 0);
    }

    @Override
    public String hello(User user) {
        return "hello Service Error,param 'user' is :" + user.toString();
    }
}
