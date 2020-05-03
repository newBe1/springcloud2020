package com.yan.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springcloud2020
 * @description  openfeign 的日志配置
 * @author: yanrui
 * @create: 2020-05-03 13:23
 **/
@Configuration
public class FeignConfig {
    /**
     * feignClient配置日志级别
     * @return
     */
    @Bean
    public Logger.Level feignLoggerLevel() {
        // 请求和响应的头信息,请求和响应的正文及元数据
        return Logger.Level.FULL;
    }
}