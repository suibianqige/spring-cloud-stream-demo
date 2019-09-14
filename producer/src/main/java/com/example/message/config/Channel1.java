package com.example.message.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;

/**
 * @Author: 杨长江
 * @Date: 2019-09-14 13:33
 * @Description: 说明
 */
public interface Channel1 extends Source {

    @Override
    @Output("channel1")
    MessageChannel output();
}
