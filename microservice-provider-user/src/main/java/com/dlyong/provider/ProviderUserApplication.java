package com.dlyong.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/***
 * 用户服务提供者
 * EnableDiscoveryClient注解:声明这是一个eureka client
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class, args);
    }

}
