package com.example.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 调用方式一
 */
@Service
public class ConsumerService {

    @Autowired
    private RestTemplate restTemplate;

    public String getName() {
        String name = restTemplate.getForObject("http://service-provider/test/getName", String.class);
        return name;
    }

}
