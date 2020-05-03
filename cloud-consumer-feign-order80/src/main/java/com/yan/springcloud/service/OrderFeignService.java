package com.yan.springcloud.service;

import com.yan.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: springcloud2020
 * @description
 * @author: yanrui
 * @create: 2020-05-03 11:22
 **/
@Component
@FeignClient(name = "CLOUD-PROVIDEREUK-PAYMENT")
public interface OrderFeignService {
    @GetMapping("/payment/getPort")
    public String getServerPort();

    @GetMapping(value = "payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);
}
