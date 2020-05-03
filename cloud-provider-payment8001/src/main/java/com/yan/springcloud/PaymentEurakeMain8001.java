package com.yan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: springcloud2020
 * @description
 * @author: yanrui
 * @create: 2020-04-10 22:39
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentEurakeMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentEurakeMain8001.class,args);
    }
}
