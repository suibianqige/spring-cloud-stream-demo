package com.example.message.service;

import com.example.message.config.Channel1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;


/**
 * @Author: 杨长江
 * @Date: 2019-09-14 11:20
 * @Description: 说明
 */
@Service
@EnableBinding(value = Channel1.class)
@Slf4j
public class ProducerService {

    @Autowired
    private Channel1 source;

    /**
     * 发送消息
     * @param msg
     */
    public void sendMsg(String msg){
        log.info("发送消息：{}",msg);
        this.source.output().send(MessageBuilder.withPayload(msg).build());
    }
}
