package com.wxx.springCloud.config;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class configBean {
    // 註冊到spring中
    @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}
