package com.yan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: springcloud2020
 * @description
 * @author: yanrui
 * @create: 2020-04-12 12:25
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsuleMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsuleMain80.class,args);
    }

}
