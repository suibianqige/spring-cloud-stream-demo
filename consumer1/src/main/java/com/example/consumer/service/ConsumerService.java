package com.example.consumer.service;

import com.example.consumer.config.MyProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

/**
 * @Author: 杨长江
 * @Date: 2019-09-14 11:45
 * @Description: 说明
 */
@Service
@Slf4j
@EnableBinding(MyProcessor.class)
public class ConsumerService {


    @ServiceActivator(inputChannel = MyProcessor.INPUT,outputChannel = MyProcessor.OUTPUT)
    public Object transform(Object payload){
        System.out.println("消息中转站："+payload);
        return payload;
    }
}
