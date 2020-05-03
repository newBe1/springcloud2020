package com.yan.springcloud.controller;

import com.yan.springcloud.entities.CommonResult;
import com.yan.springcloud.entities.Payment;
import com.yan.springcloud.service.OrderFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: springcloud2020
 * @description
 * @author: yanrui
 * @create: 2020-05-03 11:23
 **/
@RestController
@RequestMapping("consumer")
public class OrderFeignController {

    @Resource
    private OrderFeignService orderFeignService;

    @GetMapping("getPort")
    public String getPort(){
        return orderFeignService.getServerPort();
    }

    @GetMapping(value = "/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        return orderFeignService.getPaymentById(id);
    }
}
