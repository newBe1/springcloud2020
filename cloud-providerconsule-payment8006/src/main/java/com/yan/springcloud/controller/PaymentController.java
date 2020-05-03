package com.yan.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @program: springcloud2020
 * @description
 * @author: yanrui
 * @create: 2020-04-12 12:27
 **/
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("payment/consule")
    public String paymentConsule(){
        return "SpringCloud with consule" +"\t"+serverPort+ "\t"+UUID.randomUUID().toString();
    }
}
