package com.wxx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//启动之后，访问http://localhost:7001/
@SpringBootApplication
@EnableEurekaServer  //开启Eureka  服务端的启动类  可以接受别人注册进来
public class EurekaService_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaService_7001.class,args);
    }
}
