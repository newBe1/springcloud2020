package com.yan.springcloud.controller;

import com.yan.springcloud.entities.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: springcloud2020
 * @description
 * @author: yanrui
 * @create: 2020-04-12 12:32
 **/
@RestController
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL="http://cloud-providerconsule-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("order/consule")
    public String orderConsule(){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/consule",String.class);
    }

}
