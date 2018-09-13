package com.tecyang.ribbonconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//开启断路器功能
@EnableCircuitBreaker
//开启服务发现
@EnableDiscoveryClient
//@SpringCloudApplication 默认包含上述注解 可仅使用该注解
@SpringBootApplication
public class RibbonConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonConsumerApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
}
