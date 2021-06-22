package com.wxx.springCloud.controller;

import com.wxx.springCloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {
    //理解：消费者，不应该有service层
    //RestTemplate .....供我們直接調用就可以了！ 註冊到spring中
    //(url,实体：Map,Class<T> ressponseType)
    @Autowired
    public RestTemplate restTemplate;  //提供多种便捷访问远程http服务的方法，简单的restful模板

    private static final String REST_URL_PREFIX="http://localhost:8001";

    @RequestMapping("/consumer/dept/add")
    public Boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list/",List.class);
    }






















}
