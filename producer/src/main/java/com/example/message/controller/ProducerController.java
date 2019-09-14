package com.example.message.controller;

import com.example.message.service.ProducerService;
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
public class ProducerController {

    @Autowired
    private ProducerService producerService;


    @RequestMapping(value = "/send/{msg}",method = RequestMethod.GET)
    public void sendMsg(@PathVariable("msg") String msg){
        this.producerService.sendMsg(msg);
    }
}
