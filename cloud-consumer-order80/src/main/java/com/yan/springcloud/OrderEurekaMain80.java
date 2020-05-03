package com.yan.springcloud;
import com.yan.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @program: springcloud2020
 * @description
 * @author: yanrui
 * @create: 2020-04-11 14:56
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "cloud-providerEUK-payment",configuration = MySelfRule.class)
public class OrderEurekaMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderEurekaMain80.class,args);
    }
}
