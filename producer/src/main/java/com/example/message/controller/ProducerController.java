package com.example.message.controller;

import com.example.message.service.ProducerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 杨长江
 * @Date: 2019-09-14 11:18
 * @Description: 说明
 */
@RestController
@Api(tags = "生产者")
public class ProducerController {

    @Autowired
    private ProducerService producerService;


    @ApiOperation(value = "发送消息",notes = "发送kafka消息接口",httpMethod = "GET")
    @RequestMapping(value = "/send/{msg}",method = RequestMethod.GET)
    public void sendMsg(@ApiParam(required = true,value = "消息内容",type = "字符串") @PathVariable("msg") String msg){
        this.producerService.sendMsg(msg);
    }
}
