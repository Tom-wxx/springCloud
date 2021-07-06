package com.wxx.springCloud.Controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wxx.springCloud.Service.DeptService;
import com.wxx.springCloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//提供restful服务
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;


    @HystrixCommand(fallbackMethod = "hystrixGet")
    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id){
        Dept dept= deptService.queryById(id);
        if (dept==null){
            throw new RuntimeException("这个id=>"+id+"，不存在该用户");
        }
        return dept;
    }
    /*
    * 根据id查询备选方案
    * */
    public Dept hystrixGet(@PathVariable("id") Long id){
        return new Dept().setDeptno(id)
                .setDname("这个id=>"+id+"，没有对应的消息，null---@Hystrix")
                .setDb_source("在MySQL中没有该数据");
    }






















}
