package com.tecyang.feignconsumer.Service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "HelloService")
public interface RefactorHelloService extends com.tecyang.helloserviceapi.Service.HelloService{
}
