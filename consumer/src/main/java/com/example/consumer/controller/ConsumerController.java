package com.example.consumer.controller;

import com.example.consumer.service.ConsumerService;
import com.example.consumer.service.ConsumerService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("consumer")
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @Autowired
    private ConsumerService1 consumerService1;

    /**
     * 方式一：RestTemplate调用
     * @return
     */
    @RequestMapping("getName")
    public String getName() {
        return consumerService.getName();
    }

    /**
     * 方式2：@FeignClient
     */
    @RequestMapping("getName1")
    public  String getName1() {
        return consumerService1.getName1();
    }
}
