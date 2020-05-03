package com.yan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: springcloud2020
 * @description
 * @author: yanrui
 * @create: 2020-04-12 12:04
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsuleMain8006 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentConsuleMain8006.class,args);
    }
}
