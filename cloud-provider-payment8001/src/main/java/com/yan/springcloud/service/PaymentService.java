package com.yan.springcloud.service;

import com.yan.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @program: springcloud2020
 * @description
 * @author: yanrui
 * @create: 2020-04-11 12:06
 **/
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
