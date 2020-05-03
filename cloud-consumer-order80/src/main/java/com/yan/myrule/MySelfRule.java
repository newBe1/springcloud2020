package com.yan.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springcloud2020
 * @description  自定义的负载均衡配置类 不能放在@ComponentScan所扫描的当前包及其子包下
 * @author: yanrui
 * @create: 2020-04-12 18:43
 **/
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();  //随机规则
    }
}
