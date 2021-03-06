package com.yan.springcloud.controller;

import com.yan.springcloud.entities.CommonResult;
import com.yan.springcloud.entities.Payment;
import com.yan.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

/**
 * @program: springcloud2020
 * @description
 * @author: yanrui
 * @create: 2020-04-11 12:13
 **/
@RestController
@Slf4j
@RequestMapping("payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("**************插入数据结果" + result);
        if(result>0){
            return new CommonResult(200,"插入数据成功 + serverPort"+serverPort,result);
        }else {
            return new CommonResult(400,"插入数据失败",null);
        }
    }

    @GetMapping(value = "/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果："+payment);
        if(payment != null){
            return new CommonResult(200,"查询成功+serverPort" + serverPort,payment);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID："+id,null);
        }
    }

    @GetMapping("getPort")
    public String getServerPort(){
        return serverPort;
    }

}
