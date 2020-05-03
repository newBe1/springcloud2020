package com.yan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: springcloud2020
 * @description
 * @author: yanrui
 * @create: 2020-04-11 21:17
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMian80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZKMian80.class, args);
    }
}
