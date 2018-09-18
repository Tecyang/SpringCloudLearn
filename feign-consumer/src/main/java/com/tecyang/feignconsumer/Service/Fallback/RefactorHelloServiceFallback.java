package com.tecyang.feignconsumer.Service.Fallback;

import com.tecyang.feignconsumer.Service.RefactorHelloService;
import com.tecyang.helloserviceapi.Model.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
//继承方式服务接口 熔断降级Fallback方式之一：
//在Service Interface中需要@FallbackFactory

@Component
public class RefactorHelloServiceFallback implements FallbackFactory<RefactorHelloService> {

    @Override
    public RefactorHelloService create(Throwable throwable) {
        return new RefactorHelloService() {
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
        };
    }
}
