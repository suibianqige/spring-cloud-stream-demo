package com.example.message.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

/**
 * @Author: 杨长江
 * @Date: 2019-09-14 11:45
 * @Description: 说明
 */
@Service
@Slf4j
@EnableBinding(Sink.class)
public class Consumer2Service {

    @StreamListener(Sink.INPUT)
    public void rec(Object payload){
        log.info("接受到的消息：{}",payload.toString());
    }
}
