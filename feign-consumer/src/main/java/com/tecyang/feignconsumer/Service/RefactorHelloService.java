package com.tecyang.feignconsumer.Service;

import com.tecyang.feignconsumer.Service.Fallback.RefactorHelloServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "HelloService", fallbackFactory = RefactorHelloServiceFallback.class)
public interface RefactorHelloService extends com.tecyang.helloserviceapi.Service.HelloService{
}
