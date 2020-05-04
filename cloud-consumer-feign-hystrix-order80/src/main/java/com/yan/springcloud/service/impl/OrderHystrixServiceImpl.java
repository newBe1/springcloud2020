package com.yan.springcloud.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.yan.springcloud.service.OrderHystrixService;
import org.springframework.stereotype.Service;

/**
 * @program: springcloud2020
 * @description  OrderHystrixService调用其他微服务的接口 OrderHystrixServiceImpl处理fallback方法
 * @author: yanrui
 * @create: 2020-05-04 15:19
 **/
@Service
public class OrderHystrixServiceImpl implements OrderHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "--------OrderHystrixService 的fallback方法 o(Π—Π)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "--------paymentInfo_TimeOut 的fallback方法 o(Π—Π)o";
    }
}
