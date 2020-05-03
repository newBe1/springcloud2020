package com.yan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: springcloud2020
 * @description
 * @author: yanrui
 * @create: 2020-04-11 18:04
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentEurekaMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentEurekaMain8002.class, args);
    }
}
