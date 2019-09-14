package com.example.consumer.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Author: 杨长江
 * @Date: 2019-09-14 14:07
 * @Description: 说明
 */
public interface MyProcessor{

    String INPUT = "input";

    String OUTPUT = "output";

    @Output(OUTPUT)
    MessageChannel output();

    @Input(INPUT)
    SubscribableChannel input();
}
