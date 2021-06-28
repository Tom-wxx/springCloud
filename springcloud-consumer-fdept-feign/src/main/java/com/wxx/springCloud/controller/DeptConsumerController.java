package com.wxx.springCloud.controller;

import com.wxx.springCloud.pojo.Dept;
import com.wxx.springCloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class DeptConsumerController {
    /*访问：http://localhost/consumer/dept/list
    * */

    @Autowired
    public DeptClientService deptClientService;  //基于注解，没有实现类

    /**
     * 消费方添加部门信息
     * @param dept
     * @return
     */
    @RequestMapping("/consumer/dept/add")
    public Boolean add(Dept dept){
        return this.deptClientService.addDept(dept);
    }
    /**
     * 消费方根据id查询部门信息
     * @param id
     * @return
     */
    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id){

        return this.deptClientService.queryById(id);
    }

    /**
     * 消费方查询部门信息列表
     * @return
     */
    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return this.deptClientService.queryAll();
    }






















}
