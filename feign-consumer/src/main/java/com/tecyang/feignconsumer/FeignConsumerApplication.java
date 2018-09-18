package com.tecyang.feignconsumer;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@EnableDiscoveryClient
@SpringCloudApplication
public class FeignConsumerApplication {

    //默认feign 日志记录级别设置，也可以实现为配置类
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerApplication.class, args);
    }


}
