package com.example.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务端控制器
 */

@RequestMapping("test")
@RestController
public class TestController {

    @RequestMapping("getName")
    public  String getName() {
        return "SpringCloud";
    }
}
