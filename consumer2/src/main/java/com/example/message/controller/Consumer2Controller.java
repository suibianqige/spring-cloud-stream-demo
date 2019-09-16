package com.example.message.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: 杨长江
 * @Date: 2019-09-14 11:44
 * @Description: 说明
 */
@RestController
public class Consumer2Controller {

    @RequestMapping(value = "sayHello", method = RequestMethod.GET)
    public String sayHello() {
        return "hello:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
