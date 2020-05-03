package com.yan.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: springcloud2020
 * @description
 * @author: yanrui
 * @create: 2020-04-11 21:18
 **/
@RestController
@Slf4j
public class OrderController {

    public static final String INVOKE_URL = "http://cloud-providerZK-payment";
    int i = 0;
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public Object paymentInfo(){
        return restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
    }
}
