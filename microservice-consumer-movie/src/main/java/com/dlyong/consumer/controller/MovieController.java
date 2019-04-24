package com.dlyong.consumer.controller;

import com.netflix.discovery.DiscoveryClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 调用远程服务；底层是httpClent、okClient封装
 */
@RestController
@Slf4j
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${spring.application.name}")
    private String applicationName;


    @GetMapping("/user/{id}")
    public String getProviderUser(@PathVariable("id") String id) {
        String url = "http://microservice-provider-user:8000/";
        return restTemplate.getForObject(url+id,String.class);
    }

}
