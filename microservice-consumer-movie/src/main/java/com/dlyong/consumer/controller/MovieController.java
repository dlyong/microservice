package com.dlyong.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/user/{id}")
    public String getProviderUser(@PathVariable("id") String id) {

        return restTemplate.getForObject("microservice-provider-user:8000/"+id,String.class);

      /*  log.info("客户端调取服务端的方法:通过value注解获取配置文件中服务端URL的方式");
        log.info("服务端Url:"+providerServiceUrl);
        return  restTemplate.getForObject(providerServiceUrl + id,String.class);*/
    }

}
